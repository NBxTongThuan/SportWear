package com.tongthuan.sportwear_webservices.service.serviceInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tongthuan.sportwear_webservices.constantvalue.OrderStatus;
import com.tongthuan.sportwear_webservices.dto.adminRequest.AdminUpdateOrderRequest;
import com.tongthuan.sportwear_webservices.dto.request.OrderRequest.CancelOrderRequest;
import com.tongthuan.sportwear_webservices.dto.request.OrderRequest.OrderRequest;
import com.tongthuan.sportwear_webservices.dto.response.AdminResponse.CountOrderStatusResponse;
import com.tongthuan.sportwear_webservices.dto.response.AdminResponse.InterestByDateResponse;
import com.tongthuan.sportwear_webservices.dto.response.AdminResponse.RevenueByDateResponse;
import com.tongthuan.sportwear_webservices.entity.Cart;
import com.tongthuan.sportwear_webservices.entity.Orders;
import com.tongthuan.sportwear_webservices.entity.Payments;
import com.tongthuan.sportwear_webservices.entity.Users;

public interface OrdersService {

    //    forUser

    public Orders addCodOrder(OrderRequest orderRequest, HttpServletRequest request);

    public Page<Orders> findByUserName(String userName, Pageable pageable);

    public Page<Orders> findByUserNameAndOrderStatus(String userName, OrderStatus orderStatus, Pageable pageable);

    public Optional<Orders> findByOrderId(String orderId);

    public boolean cancelingOrder(CancelOrderRequest cancelOrderRequest);

    public Orders createVNPayOrder(OrderRequest orderRequest, Users user, Cart cart, String vnpTxnRef);

    public void handleCancelVNPayOrder(Payments payment);

    //    forAdmin
    public Page<Orders> adminGetAllOrders(Pageable pageable);

    public boolean adminUpdateOrderByOrderId(AdminUpdateOrderRequest adminUpdateOrderRequest);

    public Page<Orders> adminGetAllOrdersByStatus(Pageable pageable, OrderStatus orderStatus);

    Long getTotalToDayOrder();

    Long getRevenueOfMonth();

    List<RevenueByDateResponse> getRevenueByDateResponse(LocalDate start, LocalDate end);

    List<InterestByDateResponse> getInterestByDateResponse(LocalDate start, LocalDate end);

    Page<Orders> getNewOrders(Pageable pageable);

    CountOrderStatusResponse getOrderStatusRate();
}
