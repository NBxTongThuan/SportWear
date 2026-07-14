package com.tongthuan.sportwear_webservices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tongthuan.sportwear_webservices.entity.Cart;
import com.tongthuan.sportwear_webservices.entity.CartItems;
import com.tongthuan.sportwear_webservices.entity.ProductAttributes;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, String> {

    @Query("SELECT ci FROM CartItems ci WHERE ci.cart.cartId = :cartId")
    List<CartItems> findByCartId(@Param("cartId") String cartId);

    @Query("SELECT ci FROM CartItems ci WHERE ci.cart = :cart AND ci.productAttribute = :productAttribute")
    CartItems findByCartAndProductAttribute(
            @Param("cart") Cart cart, @Param("productAttribute") ProductAttributes productAttribute);

    @Transactional
    @Modifying
    @Query("DELETE FROM CartItems ci WHERE ci.cartItemId = :cartItemId")
    int deleteByCartItemID(@Param("cartItemId") String cartItemId);

    @Transactional
    @Modifying
    @Query("DELETE FROM CartItems ci WHERE ci.cart.cartId = :cartId")
    void deleteByCartId(@Param("cartId") String cartId);
}
