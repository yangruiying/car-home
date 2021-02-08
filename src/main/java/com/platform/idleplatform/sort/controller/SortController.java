package com.platform.idleplatform.sort.controller;

import com.platform.idleplatform.sort.service.SortService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sort")
@CrossOrigin
public class SortController {
    @Resource
    public SortService sortService;

    @RequestMapping("getFirstSort")
    public AppResponse getFirstSort() {
        return sortService.getFirstSort();
    }

    @RequestMapping("getSecondSort")
    public AppResponse getSecondSort(String sortId) {
        return sortService.getSecondSort(sortId);
    }

}
