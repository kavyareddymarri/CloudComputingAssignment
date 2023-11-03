package com.app.apigateway.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfig {

    /*@Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("college-service" , route -> route
                        .path("/college/api/v1/**")
                        .uri("lb://college-service"))
                .route("student-app" , route -> route
                        .path("/college/api/v1/students/**")
                        .uri("lb://student-app"))
                .build();
    }*/
}