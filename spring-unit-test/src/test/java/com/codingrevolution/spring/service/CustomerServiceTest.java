package com.codingrevolution.spring.service;

import com.codingrevolution.spring.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    void createCustomerSetsTheRegistrationDate() {
        Customer customer = new Customer("Sherlock Holmes", "221B Baker Street");

        Customer savedCustomer = customerService.create(customer);

        assertNotNull(savedCustomer.getRegistrationDate());
    }
}
