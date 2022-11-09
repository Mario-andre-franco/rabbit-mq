package com.example.rabbitmq.service.implementation;

import com.example.rabbitmq.amqp.AmqpProducer;
import com.example.rabbitmq.dto.Message;
import com.example.rabbitmq.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabittMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<Message> amqp;
    @Override
    public void sendToConsumer(Message message) {
        amqp.producer(message);
    }
}
