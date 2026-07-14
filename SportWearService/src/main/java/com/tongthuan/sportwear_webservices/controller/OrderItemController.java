package com.tongthuan.sportwear_webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tongthuan.sportwear_webservices.dto.response.OrderItemResponse;
import com.tongthuan.sportwear_webservices.service.serviceInterface.OrderItemService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/order-items")
public class OrderItemController {
    @Autowired
    private PagedResourcesAssembler<OrderItemResponse> orderItemResponsePagedResourcesAssembler;

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("/list")
    public ResponseEntity<List<OrderItemResponse>> getListOrderItemByOrderId(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "1") int size,
            @RequestParam("orderId") String orderId) {
        if (orderId.equalsIgnoreCase("")) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(orderItemService.findByOrderId(orderId).stream()
                .map(OrderItemResponse::new)
                .toList());
    }
}
