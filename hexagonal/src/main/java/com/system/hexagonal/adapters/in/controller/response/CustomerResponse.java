package com.system.hexagonal.adapters.in.controller.response;

import com.system.hexagonal.adapters.out.repository.entity.AddressEntity;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private AddressEntity addressEntity;

    private String cpf;

    private Boolean isValidCpf;
}
