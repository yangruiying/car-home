package com.platform.idleplatform.goods.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.platform.idleplatform.goods.dao.GoodsDao;
import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.ImgList;
import com.platform.idleplatform.goods.entity.OrderInfo;
import com.platform.idleplatform.goods.entity.test;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import static com.platform.idleplatform.page.PageUtils.getPageInfo;
import static java.util.Arrays.asList;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Service
public class GoodsService {
    @Resource
    GoodsDao goodsDao;

    public AppResponse getGoodsList(GoodsInfo goodsInfo) {
//        PageHelper.startPage(1, 2);
        List<GoodsInfo> goodsList = goodsDao.listGoodsByPage(goodsInfo);
        return AppResponse.success("查询成功", getPageInfo(goodsList));
    }

    public AppResponse getAttenGoodsList(String userId) {
        List<GoodsInfo> goodsInfos = goodsDao.getAttenGoodsList(userId);
        return AppResponse.success("查询成功", goodsInfos);
    }

    /**
     * 发布商品
     */
    public AppResponse addGoods(GoodsInfo goodsInfo) {
        goodsInfo.setGoodsId(StringUtil.getCommonCode(2));
        goodsDao.addGoods(goodsInfo);
        goodsDao.addImage(goodsInfo.url, goodsInfo.getGoodsId());
        return AppResponse.success("新增成功");
    }

    public AppResponse getImgList(String goodsId) {
        List<ImgList> imgLists = goodsDao.getImgList(goodsId);
        return AppResponse.success("查询成功", imgLists);
    }


    public AppResponse getGoodsById(String userId) {
        List<GoodsInfo> goodsInfos = goodsDao.getGoodsById(userId);
        return AppResponse.success("查询成功", goodsInfos);
    }

    public AppResponse getIsUserGoods(GoodsInfo goodsInfo) {
        int n = goodsDao.getIsUserGoods(goodsInfo);
        return AppResponse.success("查询成功", n);
    }

    public AppResponse getGoodsQuery(String goodsId) {
        GoodsInfo goodsInfo = goodsDao.getGoodsQuery(goodsId);
        return AppResponse.success("查询成功", goodsInfo);
    }

    public AppResponse addLeaveMessage(GoodsInfo goodsInfo) {
        goodsInfo.setlId(StringUtil.getCommonCode(2));
        goodsDao.addLeaveMessage(goodsInfo);
        return AppResponse.success("查询成功");
    }

    public AppResponse getLeaveMessage(String goodsId) {
        List<GoodsInfo> goodsInfo = goodsDao.getLeaveMessage(goodsId);
        return AppResponse.success("查询成功", goodsInfo);
    }

    public AppResponse addRecover(GoodsInfo goodsInfo) {
        goodsInfo.setlId(StringUtil.getCommonCode(2));
        goodsDao.addRecover(goodsInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse updateGoodsStatus(GoodsInfo goodsInfo) {
        List<String> goodsIdList = Arrays.asList(goodsInfo.getGoodsId().split(","));
        goodsDao.updateGoodsStatus(goodsIdList, goodsInfo.getState());
        return AppResponse.success("修改成功", 1);
    }

    public AppResponse listCheckByPage() {
        List<GoodsInfo> goodsInfoList = goodsDao.listCheckByPage();
        return AppResponse.success("查询成功", getPageInfo(goodsInfoList));
    }

    public AppResponse updateGoodsInfo(GoodsInfo goodsInfo) {
        goodsDao.updateGoodsInfo(goodsInfo);
        goodsDao.delImg(goodsInfo.getGoodsId());
        goodsDao.addImage(goodsInfo.url, goodsInfo.getGoodsId());
        return AppResponse.success("成功");
    }

    public AppResponse getGoodsByCity(String cityName) {
        List<GoodsInfo> goodsInfos = goodsDao.getGoodsByCity(cityName);
        return AppResponse.success("查询成功", goodsInfos);
    }

    public AppResponse getGoodsDetail(String goodsId) {
        GoodsInfo goodsInfo = goodsDao.getGoodsDetail(goodsId);
        return AppResponse.success("查询成功", goodsInfo);
    }

    public AppResponse getNew() {
        List<GoodsInfo> goodsInfos = goodsDao.getNew();
        return AppResponse.success("查询成功", goodsInfos);
    }

    public AppResponse getHotGoods() {
        List<GoodsInfo> goodsInfos = goodsDao.getHotGoods();
        return AppResponse.success("查询成功", goodsInfos);
    }

    public AppResponse addBrower(GoodsInfo goodsInfo) {
        goodsDao.addBrower(goodsInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getCollection(String userId) {
        int n = goodsDao.getCollection(userId);
        return AppResponse.success("查询成功", n);
    }

    public AppResponse getCollectionList(String userId) {
        List<GoodsInfo> goodsInfos = goodsDao.getCollectionList(userId);
        return AppResponse.success("查询成功", goodsInfos);
    }
}
