package com.bookshelf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig   {
	 
	  
	  @Bean
	  public PasswordEncoder passwordEncoder() {
	      return new BCryptPasswordEncoder();
	  }
	  
	  @Bean
	  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	      http.authorizeRequests()
	        .anyRequest().authenticated()
	        .and().formLogin()
	        .loginPage("/login").permitAll();
	      return http.build();
	  }
	  
	  @Autowired
	  public void configureGlobal(AuthenticationManagerBuilder auth) 
	    throws Exception {
	      auth.inMemoryAuthentication()
	        .withUser("user").password(passwordEncoder().encode("password")).roles("USER")
	        .and()
	        .withUser("admin").password(passwordEncoder().encode("password")).roles("USER", "ADMIN");
	  }

}