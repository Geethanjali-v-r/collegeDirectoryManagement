package com.college.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .requestMatchers("/login", "/register").permitAll() // allow access to these paths
                .anyRequest().authenticated() // all other requests need authentication
            .and()
            .formLogin()
                .loginPage("/login") // custom login page
                .permitAll() // allow everyone to see the login page
            .and()
            .logout()
                .permitAll(); // allow everyone to log out
        
        return http.build();
    }
}
