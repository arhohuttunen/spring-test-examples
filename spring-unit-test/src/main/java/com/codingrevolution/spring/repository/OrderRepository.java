package com.codingrevolution.spring.repository;

import com.codingrevolution.spring.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
