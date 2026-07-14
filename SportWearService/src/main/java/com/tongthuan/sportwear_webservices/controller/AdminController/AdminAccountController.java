package com.tongthuan.sportwear_webservices.controller.AdminController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import com.tongthuan.sportwear_webservices.service.AccountService;
import com.tongthuan.sportwear_webservices.service.JWTService;

@RestController
@RequestMapping("/api/admin/account")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminAccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    JWTService jwtService;

    @DeleteMapping("/lock-account")
    public ResponseEntity<?> lockAccount(@RequestParam("userId") String userId) {
        if (userId.equalsIgnoreCase("")) {
            return ResponseEntity.badRequest().body("nguoi dung khong ton tai");
        }

        if (accountService.lockAccount(userId) == null) {
            return ResponseEntity.badRequest().body("nguoi dung khong ton tai");
        }

        return ResponseEntity.ok().body("true");
    }

    @PutMapping("/unLock-account")
    public ResponseEntity<?> unLockAccount(@RequestParam("userId") String userId) {
        if (userId.equalsIgnoreCase("")) {
            return ResponseEntity.badRequest().body("nguoi dung khong ton tai");
        }

        if (accountService.unLockAccount(userId) == null) {
            return ResponseEntity.badRequest().body("nguoi dung khong ton tai");
        }

        return ResponseEntity.ok().body("true");
    }
}
