package com.tongthuan.sportwear_webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.tongthuan.sportwear_webservices.dto.request.UserAccountRequest.ChangePasswordRequest;
import com.tongthuan.sportwear_webservices.dto.request.UserAccountRequest.ResetPasswordRequest;
import com.tongthuan.sportwear_webservices.entity.Users;
import com.tongthuan.sportwear_webservices.service.AccountService;
import com.tongthuan.sportwear_webservices.service.JWTService;

@RestController
@RequestMapping("/api/account")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JWTService jwtService;

    @PostMapping("/register")
    public ResponseEntity<?> registerNewAccount(@Validated @RequestBody Users user) {
        ResponseEntity<?> response = accountService.registerAccount(user);
        return response;
    }

    @GetMapping("/active")
    public ResponseEntity<?> activeAccount(
            @RequestParam("email") String email, @RequestParam("activeCode") String activeCode) {
        ResponseEntity<?> response = accountService.activeAccount(email, activeCode);
        return response;
    }

    @PutMapping("/change-password")
    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
        boolean result = accountService.changePassword(changePasswordRequest);

        if (result) return ResponseEntity.ok().body("doi mat khau thanh cong");

        return ResponseEntity.badRequest().body("thong tin tai khoan hoac mat khau khong chinh xac!");
    }

    @GetMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestParam("email") String email) {
        if (!accountService.forgotPassword(email))
            return ResponseEntity.badRequest().body("email khong ton tai hoac gap loi trong qua trinh xu ly!");
        return ResponseEntity.ok().build();
    }

    @PostMapping("/reset-password")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        if (!accountService.resetPassword(resetPasswordRequest))
            return ResponseEntity.badRequest().build();
        return ResponseEntity.ok().build();
    }
}
