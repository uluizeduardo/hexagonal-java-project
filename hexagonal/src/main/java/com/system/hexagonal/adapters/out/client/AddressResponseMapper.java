package com.system.hexagonal.adapters.out.client;

import com.system.hexagonal.adapters.out.client.response.AddressResponse;
import com.system.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
