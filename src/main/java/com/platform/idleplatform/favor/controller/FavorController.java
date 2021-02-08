package com.platform.idleplatform.favor.controller;

import com.platform.idleplatform.favor.entity.FavorInfo;
import com.platform.idleplatform.favor.service.FavorService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("favor")
@CrossOrigin
public class FavorController {
    @Resource
    public FavorService favorService;

    @RequestMapping("addFavor")
    public AppResponse addFavor(FavorInfo favorInfo) {
        return favorService.addFavor(favorInfo);
    }

    @RequestMapping("delFavor")
    public AppResponse delFavor(FavorInfo favorInfo) {
        return favorService.delFavor(favorInfo);
    }

    @RequestMapping("isFavor")
    public AppResponse isFavor(FavorInfo favorInfo) {
        return favorService.isFavor(favorInfo);
    }


}
