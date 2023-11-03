package com.courses.app.coursesapp.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(String message) {
        super(message);
    }
}
