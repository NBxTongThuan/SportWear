package com.tongthuan.sportwear_webservices.dto.adminRequest;

import com.tongthuan.sportwear_webservices.constantvalue.OrderStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminUpdateOrderRequest {

    private String orderId;
    private OrderStatus orderStatus;
    private String orderCancelNote;
}
