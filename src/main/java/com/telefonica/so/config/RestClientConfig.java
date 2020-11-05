package com.telefonica.so.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @Author: Jose Plaza Hoyos.
 * @Datecreation: October 2020
 * @FileName: RestClientConfiguration.java
 * @AuthorCompany: Telefónica
 * @version: 0.1
 * @Description: Configuración del RestTemplate
 */
@Configuration
public class RestClientConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
	return builder.build();
    }

}
