package com.example.webservice.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class CustomPasswordEncoder {

    @Bean
    public CustomPasswordEncoder PasswordEncoder() {
        return new CustomPasswordEncoder();
    }

    public String encode(String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encode'");
    }
}
