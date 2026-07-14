package com.tongthuan.sportwear_webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.web.bind.annotation.*;

import com.tongthuan.sportwear_webservices.dto.response.UserResponse.UserResponse;
import com.tongthuan.sportwear_webservices.service.serviceInterface.UsersService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users") // Chữ thường
public class UsersController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private PagedResourcesAssembler<UserResponse> pagedAssembler;

    @GetMapping("/check-exists-by-user-name")
    public boolean checkExistsByUserName(@RequestParam("userName") String userName) {
        return usersService.checkExistsByUserName(userName);
    }

    @GetMapping("/check-exists-by-email")
    public boolean checkExistsByEmail(@RequestParam("email") String email) {
        return usersService.checkExistsByEmail(email);
    }
}
