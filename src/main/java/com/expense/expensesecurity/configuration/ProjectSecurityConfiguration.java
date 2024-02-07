package com.expense.expensesecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

//Here we define our own security system to make sure that we bypass the basic security system that is defined for
//springboot. This makes sure that we can define our own configuration systems.
@Configuration
public class ProjectSecurityConfiguration {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/addexpense", "deleteexpense", "addsaving", "/deletesaving").authenticated()
                        .requestMatchers("/home").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain) http.build();
    }
}
