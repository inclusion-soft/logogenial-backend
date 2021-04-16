package com.rc.logogenial.basicadminservice.config;

import com.google.common.collect.Lists;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import junit.framework.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//@SwaggerDefinition(
//        info = @Info(
//                description = "Awesome Resources",
//                version = "V12.0.12",
//                title = "Awesome Resource API",
//                contact = Contact(
//                        name = "Ranga Karanam",
//                        email = "ranga@in28minutes.com",
//                        url = "http://www.in28minutes.com"
//                ),
//                license = @License(
//                        name = "Apache 2.0",
//                        url = "http://www.apache.org/licenses/LICENSE-2.0"
//                )
//        ),
//        consumes = {"application/json", "application/xml"},
//        produces = {"application/json", "application/xml"},
//        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
//        externalDocs = @ExternalDocs(value = "Read This For Sure", url = "http://in28minutes.com")
//)
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
                "version 1.0",
                "https://www.alianzafiduciaria.com/iec-terminosycondiciones-enconstruccion",
                "alianzafiduciaria@soporte.com.co",
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html"
        );
        return apiInfo;
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any())
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
