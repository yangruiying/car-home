package com.platform.idleplatform.goods.controller;

import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.OrderInfo;
import com.platform.idleplatform.goods.service.GoodsService;
import com.platform.idleplatform.test.service.TestService;
import com.platform.idleplatform.tool.AppResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {
    @Resource
    GoodsService goodsService;

    @RequestMapping(value = "getGoodsList")
    AppResponse getGoodsList(GoodsInfo goodsInfo) {
        return goodsService.getGoodsList(goodsInfo);
    }

    @RequestMapping("getAttenGoodsList")
    AppResponse getAttenGoodsList(String userId) {
        return goodsService.getAttenGoodsList(userId);
    }

    @PostMapping("addGoods")
    AppResponse addGoods(GoodsInfo goodsInfo) {
        return goodsService.addGoods(goodsInfo);
    }

    @RequestMapping("getImgList")
    AppResponse getImgList(String goodsId) {
        return goodsService.getImgList(goodsId);
    }

    @RequestMapping("getGoodsById")
    AppResponse getGoodsById(String userId) {
        return goodsService.getGoodsById(userId);
    }

    @RequestMapping("getIsUserGoods")
    AppResponse getIsUserGoods(GoodsInfo goodsInfo) {
        return goodsService.getIsUserGoods(goodsInfo);
    }

    @RequestMapping("getGoodsQuery")
    AppResponse getGoodsQuery(String goodsId) {
        return goodsService.getGoodsQuery(goodsId);
    }

    @RequestMapping("addLeaveMessage")
    AppResponse addLeaveMessage(GoodsInfo goodsInfo) {
        return goodsService.addLeaveMessage(goodsInfo);
    }

    @RequestMapping("getLeaveMessage")
    AppResponse getLeaveMessage(String goodsId) {
        return goodsService.getLeaveMessage(goodsId);
    }

    @RequestMapping("addRecover")
    AppResponse addRecover(GoodsInfo goodsInfo) {
        return goodsService.addRecover(goodsInfo);
    }

    @RequestMapping("updateGoodsStatus")
    AppResponse updateGoodsStatus(GoodsInfo goodsInfo) {
        return goodsService.updateGoodsStatus(goodsInfo);
    }

    @RequestMapping("listCheckByPage")
    AppResponse listCheckByPage() {
        return goodsService.listCheckByPage();
    }

    @RequestMapping("updateGoodsInfo")
    AppResponse updateGoodsInfo(GoodsInfo goodsInfo) {
        return goodsService.updateGoodsInfo(goodsInfo);
    }

    @RequestMapping("getGoodsByCity")
    AppResponse getGoodsByCity(String cityName) {
        return goodsService.getGoodsByCity(cityName);
    }

    @RequestMapping("getGoodsDetail")
    AppResponse getGoodsDetail(String goodsId) {
        return goodsService.getGoodsDetail(goodsId);
    }

    @RequestMapping("getNew")
    AppResponse getNew() {
        return goodsService.getNew();
    }

    @RequestMapping("getHotGoods")
    AppResponse getHotGoods() {
        return goodsService.getHotGoods();
    }

    @RequestMapping("addBrower")
    AppResponse addBrower(GoodsInfo goodsInfo) {
        return goodsService.addBrower(goodsInfo);
    }

    @RequestMapping("getCollection")
    AppResponse getCollection(String userId) {
        return goodsService.getCollection(userId);
    }

    @RequestMapping("getCollectionList")
    AppResponse getCollectionList(String userId) {
        return goodsService.getCollectionList(userId);
    }
}
