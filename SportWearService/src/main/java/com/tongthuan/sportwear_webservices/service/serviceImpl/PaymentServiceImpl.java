package com.tongthuan.sportwear_webservices.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tongthuan.sportwear_webservices.dto.adminRequest.AdminUpdateOrderRequest;
import com.tongthuan.sportwear_webservices.entity.Payments;
import com.tongthuan.sportwear_webservices.repository.PaymentsRepository;
import com.tongthuan.sportwear_webservices.service.serviceInterface.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentsRepository paymentsRepository;

    @Override
    public Optional<Payments> findByOrderId(String orderId) {
        return paymentsRepository.findByOrderId(orderId);
    }

    @Override
    public boolean updateCODPayment(AdminUpdateOrderRequest adminUpdateOrderRequest) {

        Payments payment = paymentsRepository
                .findByOrderId(adminUpdateOrderRequest.getOrderId())
                .orElse(null);

        if (payment == null) return false;

        paymentsRepository.saveAndFlush(payment);
        return true;
    }
}
