package com.rc.logenialbackend.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableGlobalMethodSecurity(securedEnabled=true)
@Configuration
//@EnableSwagger2WebMvc
@EnableSwagger2
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	Logger log = LoggerFactory.getLogger(SpringSecurityConfig.class);

	@Autowired
	private UserDetailsService usuarioService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.usuarioService).passwordEncoder(passwordEncoder());
	}

	@Bean("authenticationManager")
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.csrf().disable()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}


	/**
	 * Main config.
	 *
	 * @return the docket
	 */
	@Bean
	public Docket mainConfig() {

		log.debug("Starting Swagger");
		springfox.documentation.service.Contact contact = new Contact("Logogenial-app", "http://www.carlosromero.net",
				"ncamacho44@uan.edu.co ");

		@SuppressWarnings("rawtypes")
		List<VendorExtension> vext = new ArrayList<VendorExtension>();

		ApiInfo apiInfo = new ApiInfo("Logogenial - Microservicio gestor-preguntas", "ITO GENERATOR", "1.0", "http://www.ito-software.com", contact,
				"ITO SOFTWARE SAS", "http://www.carlosromero.net", vext);

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();

	}

}
