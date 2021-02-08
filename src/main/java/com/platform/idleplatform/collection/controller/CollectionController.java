package com.platform.idleplatform.collection.controller;


import com.platform.idleplatform.collection.entity.CollectionInfo;
import com.platform.idleplatform.collection.service.CollectionService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("collection")
@CrossOrigin
public class CollectionController {
    @Resource
    public CollectionService collectionService;

    @RequestMapping("addCollection")
    public AppResponse addCollection(CollectionInfo collectionInfo) {
        return collectionService.addCollection(collectionInfo);
    }

    @RequestMapping("delCollection")
    public AppResponse delCollection(CollectionInfo collectionInfo) {
        return collectionService.delCollection(collectionInfo);
    }

    @RequestMapping("isCollection")
    public AppResponse isCollection(CollectionInfo collectionInfo) {
        return collectionService.isCollection(collectionInfo);
    }


}
