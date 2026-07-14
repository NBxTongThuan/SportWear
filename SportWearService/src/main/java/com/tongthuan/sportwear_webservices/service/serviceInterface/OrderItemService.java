package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.List;

import com.tongthuan.sportwear_webservices.entity.OrderItems;

public interface OrderItemService {
    public List<OrderItems> findByOrderId(String orderId);
}
