package com.platform.idleplatform.evaluate.service;

import com.platform.idleplatform.evaluate.dao.EvaluateDao;
import com.platform.idleplatform.evaluate.entity.EvaluateInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.RandomUtil;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EvaluateServerce {
    @Resource
    public EvaluateDao evaluateDao;

    public AppResponse addEvaluate(EvaluateInfo evaluateInfo) {
        String evaluateId = StringUtil.getCommonCode(2);
        evaluateInfo.setEvaluateId(evaluateId);
        evaluateDao.addEvaluate(evaluateInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getEvaluate(String userId) {
        List<EvaluateInfo> evaluateInfo = evaluateDao.getEvaluate(userId);
        return AppResponse.success("查询成功", evaluateInfo);
    }
}
