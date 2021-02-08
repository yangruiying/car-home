package com.platform.idleplatform.collection.service;

import com.platform.idleplatform.collection.dao.CollectionDao;
import com.platform.idleplatform.collection.entity.CollectionInfo;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CollectionService {
    @Resource
    public CollectionDao collectionDao;

    public AppResponse addCollection(CollectionInfo collectionInfo) {
        collectionDao.addCollection(collectionInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse delCollection(CollectionInfo collectionInfo) {
        collectionDao.delCollection(collectionInfo);
        return AppResponse.success("删除成功");
    }

    public AppResponse isCollection(CollectionInfo collectionInfo) {
        int n = collectionDao.isCollection(collectionInfo);
        return AppResponse.success("查询成功", n);
    }
}
