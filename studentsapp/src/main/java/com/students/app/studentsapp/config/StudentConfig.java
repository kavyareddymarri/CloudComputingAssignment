package com.students.app.studentsapp.config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public ModelMapper getModelMapperbean() {
        return new ModelMapper();
    }
}
