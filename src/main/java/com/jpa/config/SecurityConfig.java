//package com.jpa.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.stereotype.Component;
//
//public class SecurityConfig 
//{
//	@Bean
//    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
//    {
//        http
//                .csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/student/testMsg").permitAll()
//                .requestMatchers("/student").authenticated()
//                .requestMatchers("/swagger-ui.html","/swagger-ui/index.html","/swagger-resources/**", "/v2/api-docs").permitAll()
//                .and().formLogin()
//                .and().httpBasic();
//
//        return http.build();
//    }
//}
