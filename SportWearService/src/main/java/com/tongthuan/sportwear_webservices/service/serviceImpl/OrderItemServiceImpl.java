package com.tongthuan.sportwear_webservices.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tongthuan.sportwear_webservices.entity.OrderItems;
import com.tongthuan.sportwear_webservices.repository.OrderItemRepository;
import com.tongthuan.sportwear_webservices.service.serviceInterface.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;

    @Override
    public List<OrderItems> findByOrderId(String orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }
}
