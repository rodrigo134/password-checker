package com.rodrigo134.password_checker.controller;


import com.rodrigo134.password_checker.dto.PasswordRequest;
import com.rodrigo134.password_checker.dto.PasswordResponse;
import com.rodrigo134.password_checker.service.PasswordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/password")
public class PasswordController {

    final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping
    public ResponseEntity<PasswordResponse> checkPassword(@RequestBody PasswordRequest request) {
        PasswordResponse response = passwordService.checkPassword(request);
        if(response.errors().isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);

        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
