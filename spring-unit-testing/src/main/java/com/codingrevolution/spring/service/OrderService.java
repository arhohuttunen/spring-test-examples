package com.codingrevolution.spring.service;

import com.codingrevolution.spring.model.Order;
import com.codingrevolution.spring.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order) {
        order.setCreationDate(LocalDateTime.now());
        return orderRepository.save(order);
    }
}
