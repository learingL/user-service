package com.hiveview.service;


import com.hiveview.entity.BalanceDetail;
import com.hiveview.entity.Orders;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by gonglixun on 2017/2/8.
 */
public interface OrdersService {

    public Orders addOrder(String productName, BigDecimal totalFee, int userId, int dataType);

    public Orders getOrderByUserIdAndOrderId(int userId, int orderId);

    public Orders getOrderByOrderNo(String orderNo);

    public Orders getOrderByUserId(int userId);

    public int updateOrder(int userId, int id, int dataStatus);

    public int updateOrder(String orderNo, int dataStatus);

    public int updateHandlerOrder(int userId, int id, int dataStatus, String openid, BigDecimal totalFee, String orderNo);

//    public Orders addOrdersLog();

    /**
     * 查询充值记录
     * @param userId
     * @return
     */
    public List<Orders> getOrdersByUserId(int userId);
}
