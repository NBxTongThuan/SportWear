package com.tongthuan.sportwear_webservices.service.serviceInterface;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tongthuan.sportwear_webservices.entity.Notifications;

public interface NotificationService {

    public Page<Notifications> getUnReadNotifications(Pageable pageable);

    public Page<Notifications> findAll(Pageable pageable);

    public boolean setIsRead(String notificationId);
}
