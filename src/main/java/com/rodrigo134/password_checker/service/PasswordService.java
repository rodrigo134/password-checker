package com.rodrigo134.password_checker.service;

import com.rodrigo134.password_checker.dto.PasswordRequest;
import com.rodrigo134.password_checker.dto.PasswordResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PasswordService {


    public PasswordResponse checkPassword(PasswordRequest request) {
        List<String> errors = new ArrayList<>();
        hasMinLength(request,errors);
        hasUpperCase(request, errors);
        //hasLowerCase(String password);
        hasDigit(request, errors);
        hasSpecialChar(request ,errors);
        PasswordResponse response = new PasswordResponse(errors,request.password());

        return response;
    }

    public void hasMinLength(PasswordRequest request, List<String> errors) {
        if (request.password().length() <=8 || request.password().isEmpty()){
            errors.add("Senha menor que 8 dígitos ou vazia");
        }

    }
    public void hasUpperCase(PasswordRequest request, List<String> errors){
        if(!request.password().matches(".*[A-Z].*")){
            errors.add("Senha sem letras maiúsculas");
        }
    }

public void hasSpecialChar(PasswordRequest request, List<String>errors){
        if(!request.password().matches(".*[!@#$%¨&*_=+;].*")){
            errors.add("Senha sem caracteres especiais");
        }
    }

    public void hasDigit(PasswordRequest request, List<String>errors){
        if(!request.password().matches(".*[0-9].*")){
            errors.add("Senha sem números");
        }
    }






}
