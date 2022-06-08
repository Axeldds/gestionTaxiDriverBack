package com.inti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.inti.service.impl.AppUserDetailsService;


@Configuration // pour créer un bean avec le nom suivant : securityConfig
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	@Autowired
	private BCryptPasswordEncoder baBCryptPasswordEncoder;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(appUserDetailsService).passwordEncoder(baBCryptPasswordEncoder);
	}

	protected void configure(HttpSecurity http) throws Exception{
		http // la sécurité des requêtes http
			.authorizeRequests()
				.anyRequest().authenticated()  // vérifier les requêtes envoyés par les utilisateurs
			.and()
			.formLogin() // formulaire du login fournit par Spring security
				.permitAll()
			.and()
			.logout()
				.logoutUrl("/logout")
				.permitAll()
			.and()
			.httpBasic() // BAA
			.and()
			.csrf().disable(); // méthode d'attaque informatique (cybersécurité)
	}}