package com.example.brewery.service;

import com.example.brewery.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public Customer getCustomer(UUID id) {
        return Customer.builder()
                .customerId(UUID.randomUUID())
                .name("Sam")
                .build();
    }
}
