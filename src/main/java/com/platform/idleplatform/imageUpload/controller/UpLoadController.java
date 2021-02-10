package com.platform.idleplatform.imageUpload.controller;


import com.platform.idleplatform.annotation.IgnoreAuth;
import com.platform.idleplatform.imageUpload.service.UpLoadService;
import com.platform.idleplatform.tool.AppResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("imageUpload")
public class UpLoadController {
    @Resource
    private UpLoadService upLoadService;
    private static final Logger logger = LoggerFactory.getLogger(UpLoadController.class);

    /**
     * 图片上传
     *
     * @param imageFile
     * @return
     */
    @RequestMapping(value = "uploadImage")
    @IgnoreAuth
    AppResponse uploadImage(MultipartFile imageFile) {
        try {
            return upLoadService.upLoadImage(imageFile);
        } catch (Exception e) {
            logger.error("新增错误", e);
            System.out.println(e.toString());
            throw e;
        }
    }
}
