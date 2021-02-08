package com.platform.idleplatform.order.dao;

import com.platform.idleplatform.order.entity.BuyInfo;
import com.platform.idleplatform.order.entity.ExpressInfo;
import com.platform.idleplatform.order.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    public int addOrder(OrderInfo orderInfo);

    public List<OrderInfo> getBuyList(String buyer);

    public List<OrderInfo> getSellList(String userId);

    public int getIsOrder(BuyInfo buyInfo);

    public OrderInfo getOrderState(BuyInfo buyInfo);

    public int shipGoods(ExpressInfo expressInfo);

    public List<ExpressInfo> getExpress();

    public ExpressInfo getOrderExpress(String orderId);

    public int changeState(OrderInfo orderInfo);
}
