package com.system.hexagonal.application.core.usecase;

import com.system.hexagonal.application.core.domain.Customer;
import com.system.hexagonal.application.core.ports.in.FindCustomerByIdInputPort;
import com.system.hexagonal.application.core.ports.out.FindCustomerByIdOutPutPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutPutPort findCustomerByIdOutPutPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutPutPort findCustomerByIdOutPutPort){
        this.findCustomerByIdOutPutPort = findCustomerByIdOutPutPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutPutPort.find(id).orElseThrow(() -> new RuntimeException("Customer Not Found"));
    }
}
