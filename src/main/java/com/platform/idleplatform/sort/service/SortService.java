package com.platform.idleplatform.sort.service;

import com.platform.idleplatform.sort.dao.SortDao;
import com.platform.idleplatform.sort.entity.SortInfo;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SortService {
    @Resource
    public SortDao sortDao;

    public AppResponse getFirstSort() {
        return AppResponse.success("查询成功", sortDao.getFirstSort());
    }

    public AppResponse getSecondSort(SortInfo sortInfo) {
        return AppResponse.success("查询成功", sortDao.getSecondSort(sortInfo));
    }
}
