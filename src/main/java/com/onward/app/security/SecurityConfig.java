package com.onward.app.security;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; 
import org.springframework.security.core.userdetails.User; 
import org.springframework.security.core.userdetails.UserDetails; 
import org.springframework.security.core.userdetails.UserDetailsService; 
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; 
import org.springframework.security.crypto.password.PasswordEncoder; 
import org.springframework.security.provisioning.InMemoryUserDetailsManager; 
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

// Made by Jack Turk
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    // User Creation 
    @Bean
    UserDetailsService userDetailsService(PasswordEncoder encoder) { 
  
        // InMemoryUserDetailsManager 
        UserDetails admin = User.withUsername("Jack") 
                .password(encoder.encode("123")) 
                .roles("ADMIN", "USER") 
                .build(); 
  
        UserDetails user = User.withUsername("JackUser") 
                .password(encoder.encode("123")) 
                .roles("USER") 
                .build(); 
  
        return new InMemoryUserDetailsManager(admin, user); 
    }

    // Configuring HttpSecurity 
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
        return http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/auth/welcome").permitAll())
                .authorizeHttpRequests(requests -> requests.requestMatchers("/auth/user/**").authenticated())
                .authorizeHttpRequests(requests -> requests.requestMatchers("/auth/admin/**").authenticated()).formLogin(withDefaults()).build(); 
    }

    // Password Encoding 
    @Bean
    PasswordEncoder passwordEncoder() { 
        return new BCryptPasswordEncoder(); 
    } 
  
} 
