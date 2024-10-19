package com.loja.loja.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.loja.loja.repository", "com.loja.loja.person"})
public class AppConfig {

}