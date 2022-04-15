package ru.kata.spring.boot_security.demo.configs.JWT;

import org.springframework.security.core.AuthenticationException;

public class JWTAuthenticationException extends AuthenticationException {
    public JWTAuthenticationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public JWTAuthenticationException(String msg) {
        super(msg);
    }
}
