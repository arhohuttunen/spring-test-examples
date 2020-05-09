package com.codingrevolution.spring.service;

import com.codingrevolution.spring.repository.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class BadExampleTest {

    @Autowired
    private OrderService orderService;

    @Test
    void saveCreatedDateForOrder() {
        Order order = new Order();

        Order savedOrder = orderService.create(order);

        assertNotNull(savedOrder.getDateCreated());
    }
}
