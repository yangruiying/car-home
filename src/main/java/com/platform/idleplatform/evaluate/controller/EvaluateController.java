package com.platform.idleplatform.evaluate.controller;

import com.platform.idleplatform.evaluate.entity.EvaluateInfo;
import com.platform.idleplatform.evaluate.service.EvaluateServerce;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("evaluate")
@CrossOrigin
@RestController
public class EvaluateController {
    @Resource
    public EvaluateServerce evaluateServerce;

    @RequestMapping("addEvaluate")
    public AppResponse addEvaluate(EvaluateInfo evaluateInfo) {
        return evaluateServerce.addEvaluate(evaluateInfo);
    }

    @RequestMapping("getEvaluate")
    public AppResponse getEvaluate(String userId) {
        return evaluateServerce.getEvaluate(userId);
    }
}
