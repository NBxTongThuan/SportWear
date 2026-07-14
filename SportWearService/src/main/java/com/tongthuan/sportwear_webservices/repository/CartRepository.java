package com.tongthuan.sportwear_webservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tongthuan.sportwear_webservices.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

    @Query(value = "SELECT * FROM cart WHERE user_id = :userId", nativeQuery = true)
    Optional<Cart> findByUserId(@Param("userId") String userId);

    @Query("SELECT c FROM Cart c WHERE c.user.userId = :userId")
    Cart findCartByUserId(@Param("userId") String userId);
}
