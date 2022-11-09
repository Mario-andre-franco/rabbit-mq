package com.example.rabbitmq.service;

import com.example.rabbitmq.dto.Message;

public interface AmqpService {
    void sendToConsumer(Message message);
}
