package com.loja.loja;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LojaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojaApplication.class, args);
    }

    @Bean
    ApplicationRunner runner(PasswordEncoder passwordEncoder) {
        return args -> System.out.println(passwordEncoder.encode("password"));
    }

}
