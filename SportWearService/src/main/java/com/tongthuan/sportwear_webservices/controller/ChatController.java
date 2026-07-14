package com.tongthuan.sportwear_webservices.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

import com.tongthuan.sportwear_webservices.entity.ChatBoxMessages;
import com.tongthuan.sportwear_webservices.service.ChatBoxService;

@Controller
public class ChatController {

    @Autowired
    private ChatBoxService chatBoxService;

    @MessageMapping("/chat.send")
    private void sendMessage(@Payload ChatBoxMessages messages, Principal principal) {
        chatBoxService.sendMessage(messages, principal);
    }
}
