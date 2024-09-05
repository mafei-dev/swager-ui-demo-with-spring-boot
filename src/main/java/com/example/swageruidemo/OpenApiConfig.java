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
                        .title("Your API Titlesdsds")
                        .version("v1.0")
                        .description("Your API Description")
                        .termsOfService("http://your-terms-of-service-url.com")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your-email@domain.com")
                                .url("http://your-url.com"))
                        .license(new License()
                                .name("Your License")
                                .url("http://your-license-url.com")));
    }
}
