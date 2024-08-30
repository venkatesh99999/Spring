package com.example.demo.securityConfig;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity
public class SecurityConfigurationClass {
	

//    @Autowired
//    private AuthEntryPointJwt unauthorizedHandler;
//
//    @Bean
//    public AuthTokenFilter authenticationJwtTokenFilter() {
//        return new AuthTokenFilter();
//    }

	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((requests) -> requests.anyRequest().authenticated());
		
//		 http.authorizeHttpRequests(authorizeRequests ->
//         authorizeRequests.requestMatchers("/signin").permitAll()
//                 .anyRequest().authenticated());
		//http.exceptionHandling(exception->exception.authenticationEntryPoint(unauthorizedHandler));
//		 http.headers(headers -> headers
//	                .frameOptions(frameOptions -> frameOptions
//	                        .sameOrigin()
//	                )
//	        );
/*		   http.sessionManagement(
	                session ->
	                        session.sessionCreationPolicy(
	                                SessionCreationPolicy.STATELESS)*/
	       // );
//	        http.csrf(csrf -> csrf.disable());
//	        http.addFilterBefore(authenticationJwtTokenFilter(),
//	               UsernamePasswordAuthenticationFilter.class);
//	       //http.formLogin(withDefaults());
	       http.httpBasic(withDefaults());
		return http.build();
	}
	
	@Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        UserDetails user = User.withUsername("user")
                               .password("{noop}user") // {noop} indicates that no encoding is applied
                               .roles("USER")
                               .build();
        UserDetails admin = User.withUsername("admin")
                                .password("{noop}admin")
                                .roles("USER", "ADMIN")
                                .build();
        manager.createUser(user);
        manager.createUser(admin);
        return manager;
    }
//	   @Bean
//	    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
//	        return builder.getAuthenticationManager();
//	    }

}
