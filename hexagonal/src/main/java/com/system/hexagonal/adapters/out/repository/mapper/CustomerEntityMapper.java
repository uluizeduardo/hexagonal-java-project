package com.system.hexagonal.adapters.out.repository.mapper;

import com.system.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.system.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
