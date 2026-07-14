package com.tongthuan.sportwear_webservices.service.serviceInterface;

public interface EmailService {

    public void sendMessage(String from, String to, String subject, String text);
}
