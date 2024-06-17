package com.example.webservice.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class PasswordEncoderUtil {

    @Bean
    public PasswordEncoderUtil passwordEncoder() {
        return new PasswordEncoderUtil();
    }

    public String encode(String password) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encode'");
    }
}
