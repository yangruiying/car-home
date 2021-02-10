package com.platform.idleplatform.goods.dao;

import com.platform.idleplatform.goods.entity.GoodsInfo;
import com.platform.idleplatform.goods.entity.ImgList;
import com.platform.idleplatform.goods.entity.OrderInfo;
import com.platform.idleplatform.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodsDao {
    List<GoodsInfo> listGoodsByPage(GoodsInfo goodsInfo);

    List<GoodsInfo> getAttenGoodsList(String userId);

    int addGoods(GoodsInfo goodsInfo);

    int addImage(@Param("url") List<String> url, @Param("goodsId") String goodsId);

    List<ImgList> getImgList(String goodsId);

    List<GoodsInfo> getGoodsById(String userId);

    int getIsUserGoods(GoodsInfo userInfo);

    GoodsInfo getGoodsQuery(String goodsId);

    int addLeaveMessage(GoodsInfo goodsInfo);

    List<GoodsInfo> getLeaveMessage(String goodsId);

    int addRecover(GoodsInfo goodsInfo);

    int updateGoodsStatus(@Param("goodsIdList") List<String> goodsIdList, @Param("state") int state);

    List<GoodsInfo> listCheckByPage();

    int updateGoodsInfo(GoodsInfo goodsInfo);

    int delImg(String goodsId);

    List<GoodsInfo> getGoodsByCity(String cityName);

    GoodsInfo getGoodsDetail(String goodsId);

    List<GoodsInfo> getNew();

    List<GoodsInfo> getHotGoods();

    int addBrower(GoodsInfo goodsInfo);

    int getCollection(String userId);

    List<GoodsInfo> getCollectionList(String userId);

    List<GoodsInfo> getGoodsBySortId(String sortId);
}
