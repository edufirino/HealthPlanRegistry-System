package br.com.ekan.security.dto;

import br.com.ekan.entities.Role;

import java.util.List;

public record RecoveryUserDto(Long id,
                              String email,
                              List<Role> roles
) {
}
