package com.loja.loja.sec;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    public record LoginRequest(String username, String password) {
    }

}
