package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.util.Optional;

import com.tongthuan.sportwear_webservices.dto.adminRequest.AdminUpdateOrderRequest;
import com.tongthuan.sportwear_webservices.entity.Payments;

public interface PaymentService {

    public Optional<Payments> findByOrderId(String orderId);

    public boolean updateCODPayment(AdminUpdateOrderRequest adminUpdateOrderRequest);
}
