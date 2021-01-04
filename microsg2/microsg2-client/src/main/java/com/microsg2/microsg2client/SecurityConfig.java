package com.microsg2.microsg2client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.Http403ForbiddenEntryPoint;


import com.microsg2.microsg2client.daoAuthProvider.AuthorDetails;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}

	@Bean
	public AuthorDetails authorDetailsService() {
		return new AuthorDetails();
	}

	@Override
	  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService(authorDetailsService()).passwordEncoder(encoder());
	  }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable()
                .exceptionHandling()
                .authenticationEntryPoint(new Http403ForbiddenEntryPoint() {
                })
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .defaultSuccessUrl("/")
                //.failureUrl("/login.html?error=true")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true)
                .and()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/login").permitAll()
                .antMatchers("/logout").permitAll()
                .antMatchers("/article").permitAll()
                .antMatchers("/createAuthor").permitAll()
                .antMatchers("/saveAuthor").permitAll()
                .antMatchers("/category").permitAll()
                .antMatchers("/createCategory").permitAll()
                .antMatchers("/updateCategory").permitAll()
                .antMatchers("/saveCategory").permitAll()
                .antMatchers("/createArticle").authenticated()
                .antMatchers("/saveArticle").authenticated()
                .antMatchers("/updateArticle").authenticated()
                .antMatchers("/saveComment").authenticated()
                .antMatchers("/updateAuthor").authenticated()
                .antMatchers("/deleteAuthor").authenticated();
    }
}
