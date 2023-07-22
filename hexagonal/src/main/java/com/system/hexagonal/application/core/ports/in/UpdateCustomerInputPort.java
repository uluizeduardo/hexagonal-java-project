package com.system.hexagonal.application.core.ports.in;

import com.system.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
