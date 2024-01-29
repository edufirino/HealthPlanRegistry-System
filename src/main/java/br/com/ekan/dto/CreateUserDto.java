package br.com.ekan.dto;

import br.com.ekan.security.RoleName;

public record CreateUserDto(

        String email,
        String password,
        RoleName role

) {
}