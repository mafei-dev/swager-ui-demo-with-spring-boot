package com.example.swageruidemo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("StackSaga Cassandra Support API")
                        .version("v1.0")
                        .description("StackSaga Cassandra Support API")
                        .termsOfService("http://your-terms-of-service-url.com")
                        .contact(new Contact()
                                .name("Mafei")
                                .email("mafei.dev@gamil.com")
                                .url("http://stacksaga.org"))
                        .license(new License()
                                .name("Your License")
                                .url("http://your-license-url.com")));
    }
}
