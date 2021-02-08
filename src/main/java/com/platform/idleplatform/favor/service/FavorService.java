package com.platform.idleplatform.favor.service;

import com.platform.idleplatform.favor.dao.FavorDao;
import com.platform.idleplatform.favor.entity.FavorInfo;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FavorService {
    @Resource
    public FavorDao favorDao;

    public AppResponse addFavor(FavorInfo favorInfo) {
        favorDao.addFavor(favorInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse delFavor(FavorInfo favorInfo) {
        favorDao.delFavor(favorInfo);
        return AppResponse.success("删除成功");
    }

    public AppResponse isFavor(FavorInfo favorInfo) {
        int n = favorDao.isFavor(favorInfo);
        return AppResponse.success("查询成功", n);
    }
}
