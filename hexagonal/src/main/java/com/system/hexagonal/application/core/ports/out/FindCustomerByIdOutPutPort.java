package com.system.hexagonal.application.core.ports.out;

import com.system.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutPutPort {

    Optional<Customer> find(String id);

}
