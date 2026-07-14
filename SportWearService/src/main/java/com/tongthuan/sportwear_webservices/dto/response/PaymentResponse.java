package com.tongthuan.sportwear_webservices.dto.response;

import java.time.LocalDateTime;

import com.tongthuan.sportwear_webservices.constantvalue.PaymentMethod;
import com.tongthuan.sportwear_webservices.constantvalue.PaymentStatus;
import com.tongthuan.sportwear_webservices.entity.Payments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

    private String paymentId;
    private LocalDateTime createdDate;
    private PaymentMethod paymentMethod;
    private PaymentStatus paymentStatus;
    private String orderId;

    public PaymentResponse(Payments payments) {
        this.paymentId = payments.getPaymentId();
        this.createdDate = payments.getCreatedDate();
        this.paymentMethod = payments.getPaymentMethod();
        this.paymentStatus = payments.getStatus();
        this.orderId = payments.getOrder().getOrderId();
    }
}
