package com.tongthuan.sportwear_webservices.dto.request.PaymentRequest;

import com.tongthuan.sportwear_webservices.constantvalue.PaymentStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {

    private String orderId;
    private PaymentStatus paymentStatus;
}
