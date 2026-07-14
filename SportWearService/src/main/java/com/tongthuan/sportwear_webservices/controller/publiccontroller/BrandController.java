package com.tongthuan.sportwear_webservices.controller.publiccontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tongthuan.sportwear_webservices.dto.response.BrandResponse.BrandResponse;
import com.tongthuan.sportwear_webservices.service.serviceInterface.BrandService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/get-by-product-id")
    public ResponseEntity<Optional<BrandResponse>> getBrandByProductId(@RequestParam("productId") String productId) {
        if (productId.equalsIgnoreCase("")) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().body(brandService.findByProductID(productId).map(BrandResponse::new));
    }
}
