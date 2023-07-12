package com.system.hexagonal.adapters.out;

import com.system.hexagonal.adapters.out.client.AddressResponseMapper;
import com.system.hexagonal.adapters.out.client.FindAddressByZipCodeClient;
import com.system.hexagonal.application.core.domain.Address;
import com.system.hexagonal.application.core.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
       var addressResponse = findAddressByZipCodeClient.find(zipCode);
       return addressResponseMapper.toAddress(addressResponse);
    }
}
