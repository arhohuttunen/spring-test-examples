package com.codingrevolution.spring.repository;

import com.codingrevolution.spring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
