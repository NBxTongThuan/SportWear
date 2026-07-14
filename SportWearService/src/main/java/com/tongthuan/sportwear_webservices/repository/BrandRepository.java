package com.tongthuan.sportwear_webservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tongthuan.sportwear_webservices.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

    Optional<Brand> findByBrandName(String brandName);

    // Qery này làm việc dựa trên entity
    @Query("SELECT b FROM Brand b JOIN b.productsList p WHERE p.productId = :productId")
    Optional<Brand> findByproductId(@Param("productId") String productId);
}
