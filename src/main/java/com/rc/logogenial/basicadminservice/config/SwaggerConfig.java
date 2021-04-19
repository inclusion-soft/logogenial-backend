package com.rc.logogenial.basicadminservice.config;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import com.google.common.base.Predicates;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /** The log. */
    private final Logger log = LoggerFactory.getLogger(SwaggerConfig.class);

    /** The Constant AUTHORIZATION_HEADER. */
    public static final String AUTHORIZATION_HEADER = "Authorization";

    /** The Constant DEFAULT_INCLUDE_PATTERN. */
    public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";


    /**
     * API Info as it appears on the swagger-ui page
     */
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Alianza Fiduciaria - Integración estratégica de constructoras",
                "Proyecto de integración estragégica de constructora, la API Rest del software de gestión de proyectos inmobiliarios al alcance de los usuarios Salas de ventas",
                "version 0.9",
                "https://www.alianzafiduciaria.com/iec-terminosycondiciones-enconstruccion",
                "alianzafiduciaria@soporte.com.co",
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
        return apiInfo;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error.*?")))
                //.paths(PathSelectors.any())
                //.paths(PathSelectors.regex("/error.*")..any())
        //.PathSelectors.regex("/error.*").negate()
                //.paths(Predicate.not(PathSelectors.regex("/error.*")))
                .build().securityContexts(Lists.newArrayList(securityContext())).securitySchemes(Lists.newArrayList(apiKey()))
                ;
        //.paths(regex("/v1/.*")).build()
    }

    /**
     * Security context.
     *
     * @return the security context
     */
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth())
                .forPaths(PathSelectors.regex(DEFAULT_INCLUDE_PATTERN)).build();
    }

    /**
     * Default auth.
     *
     * @return the list
     */
    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Lists.newArrayList(new SecurityReference("JWT", authorizationScopes));
    }
    /**
     * Api key.
     *
     * @return the api key
     */
    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }
}
