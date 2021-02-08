package com.platform.idleplatform.test.service;

import com.platform.idleplatform.test.dao.TestDao;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {
    @Resource
    TestDao testDao;

    public AppResponse getTest() {
        int num = testDao.getNum();
        return AppResponse.success("查询成功", num);
    }
}
