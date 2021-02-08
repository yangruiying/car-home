package com.platform.idleplatform.test.controller;

import com.platform.idleplatform.test.service.TestService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    TestService testService;

    @RequestMapping(value = "getTest")
    AppResponse getTest() {
        return testService.getTest();
    }

}
