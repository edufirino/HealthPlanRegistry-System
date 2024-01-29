package br.com.ekan.api;

import br.com.ekan.dto.CreateUserDto;
import br.com.ekan.dto.LoginUserDto;
import br.com.ekan.security.dto.RecoveryJwtTokenDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserApi {
    @Operation(summary = "Login", tags = {"Authentication"})
    @PostMapping("/login")
    ResponseEntity<RecoveryJwtTokenDto> authenticateUser(@RequestBody LoginUserDto loginUserDto);

    @Operation(summary = "Sign Up", tags = {"Authentication"})
    @PostMapping
    ResponseEntity<Void> createUser(@RequestBody CreateUserDto createUserDto);
}
