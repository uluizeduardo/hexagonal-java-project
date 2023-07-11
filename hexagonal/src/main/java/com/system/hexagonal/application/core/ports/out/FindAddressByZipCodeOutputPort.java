package com.system.hexagonal.application.core.ports.out;

import com.system.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
