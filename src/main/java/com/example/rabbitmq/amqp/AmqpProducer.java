package com.example.rabbitmq.amqp;

public interface AmqpProducer<T>{
    void producer(T t);
}
