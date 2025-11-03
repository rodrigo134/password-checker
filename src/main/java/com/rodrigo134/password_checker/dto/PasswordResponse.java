package com.rodrigo134.password_checker.dto;

import java.util.List;

public record PasswordResponse(List<String> errors, String password) {

}
