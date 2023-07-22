package com.system.hexagonal.application.core.ports.out;

import com.system.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
