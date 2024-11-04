package com.example.brewery.service;

import com.example.brewery.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CustomerService {

    Customer getCustomer(UUID id);
}
