package com.salon.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SalonSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder cutter)
        throws Exception {
        cutter.inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles("Manager")
                .and()
                .withUser("Admin")
                .password(encoder().encode("12345"))
                .roles("Admin","Manager");
    }

    @Override
    protected void configure(HttpSecurity http)
        throws Exception {
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"salon/Warning/**/create/**").hasRole("Manager")
                .anyRequest()
                .authenticated().and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
                .formLogin()
                .disable();

    }
    @Bean
    public PasswordEncoder encoder(){
        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

}
