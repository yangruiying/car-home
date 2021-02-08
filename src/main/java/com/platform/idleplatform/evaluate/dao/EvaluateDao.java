package com.platform.idleplatform.evaluate.dao;

import com.platform.idleplatform.evaluate.entity.EvaluateInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EvaluateDao {

    public int addEvaluate(EvaluateInfo evaluateInfo);

    public List<EvaluateInfo> getEvaluate(String userId);
}
