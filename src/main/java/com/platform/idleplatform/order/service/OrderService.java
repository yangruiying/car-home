package com.platform.idleplatform.order.service;

import com.alibaba.fastjson.JSONObject;
import com.platform.idleplatform.order.dao.OrderDao;
import com.platform.idleplatform.order.entity.BuyInfo;
import com.platform.idleplatform.order.entity.ExpressInfo;
import com.platform.idleplatform.order.entity.OrderInfo;
import com.platform.idleplatform.tool.AppResponse;
import com.platform.idleplatform.tool.KdniaoTrackQueryAPI;
import com.platform.idleplatform.tool.StringUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {
    @Resource
    public OrderDao orderDao;

    public AppResponse addOrder(OrderInfo orderInfo) {
        orderInfo.setOrderId(StringUtil.getCommonCode(2));
        orderDao.addOrder(orderInfo);
        return AppResponse.success("新增成功");
    }

    public AppResponse getBuyList(String buyer) {
        List<OrderInfo> orderInfoList = orderDao.getBuyList(buyer);
        return AppResponse.success("查询成功", orderInfoList);
    }

    public AppResponse getSellList(String userId) {
        List<OrderInfo> orderInfos = orderDao.getSellList(userId);
        return AppResponse.success("查询成功", orderInfos);
    }

    public AppResponse getIsOrder(BuyInfo buyInfo) {
        int n = orderDao.getIsOrder(buyInfo);
        return AppResponse.success("查询成功", n);
    }

    public AppResponse getOrderState(BuyInfo buyInfo) {
        OrderInfo state = orderDao.getOrderState(buyInfo);
        return AppResponse.success("查询成功", state);
    }

    public AppResponse shipGoods(ExpressInfo expressInfo) {
        int n = orderDao.shipGoods(expressInfo);
        return AppResponse.success("更新成功", n);
    }

    public AppResponse getExpress() {
        List<ExpressInfo> expressInfo = orderDao.getExpress();
        return AppResponse.success("查询成功", expressInfo);
    }

    public AppResponse getTrack(ExpressInfo expressInfo) {
        String track = KdniaoTrackQueryAPI.getTrack(expressInfo.expressCode, expressInfo.expressNo);
        JSONObject jo = JSONObject.parseObject(new String(track));
        return AppResponse.success("查询成功", jo);
    }

    public AppResponse getOrderExpress(String orderId) {
        ExpressInfo expressInfo = orderDao.getOrderExpress(orderId);
        return AppResponse.success("查询成功", expressInfo);
    }

    public AppResponse changeState(OrderInfo orderInfo) {
        int n = orderDao.changeState(orderInfo);
        return AppResponse.success("更新成功", n);
    }
}
