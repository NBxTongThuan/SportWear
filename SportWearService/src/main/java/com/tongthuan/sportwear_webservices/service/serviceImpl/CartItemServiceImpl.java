package com.tongthuan.sportwear_webservices.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tongthuan.sportwear_webservices.dto.request.CartItemRequest.UpdateCartItemRequest;
import com.tongthuan.sportwear_webservices.entity.CartItems;
import com.tongthuan.sportwear_webservices.repository.CartItemsRepository;
import com.tongthuan.sportwear_webservices.service.serviceInterface.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemsRepository cartItemsRepository;

    @Override
    public boolean updateCartItem(UpdateCartItemRequest updateCartItemRequest) {
        CartItems cartItems = cartItemsRepository
                .findById(updateCartItemRequest.getCartItemId())
                .orElse(null);
        if (cartItems == null) return false;

        cartItems.setQuantity(updateCartItemRequest.getQuantity());
        cartItemsRepository.saveAndFlush(cartItems);
        return true;
    }
}
