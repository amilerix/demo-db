package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.antMatcher("/**").authorizeRequests()
                .antMatchers("/api/v1/student").permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Client();
    }
}
