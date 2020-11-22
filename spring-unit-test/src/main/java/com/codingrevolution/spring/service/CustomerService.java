package com.codingrevolution.spring.service;

import com.codingrevolution.spring.model.Customer;
import com.codingrevolution.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        customer.setRegistrationDate(LocalDateTime.now());
        return customerRepository.save(customer);
    }
}
