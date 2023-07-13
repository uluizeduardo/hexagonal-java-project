package com.system.hexagonal.application.core.ports.in;

import com.system.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
