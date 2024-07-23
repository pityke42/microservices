package com.pityke17.notification.notification;

import com.pityke17.notification.kafka.payment.PaymentConfirmation;
import com.pityke17.notification.kafka.payment.PaymentMethod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
