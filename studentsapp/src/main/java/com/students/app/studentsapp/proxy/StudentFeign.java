package com.students.app.studentsapp.proxy;

import com.students.app.studentsapp.studentresponse.CourseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name="COURSE-SERVICE")
public interface StudentFeign {

  @GetMapping("/coursesapi/registeredcourses/{studentid}")
   List<CourseResponse> getcoursesbyid(@PathVariable long studentid);

    @GetMapping("/coursesapi/courses")
    public ResponseEntity<List<CourseResponse>> getAllcourses();

 @PostMapping("/coursesapi/courses/{student_id}")
 public HttpStatus postCourses(@PathVariable long student_id, @RequestBody CourseResponse courseResponse);
 @PutMapping("/coursesapi/courses/{id}")
 public HttpStatus putCourses(@PathVariable Long id, @RequestBody CourseResponse courseResponse);

 @DeleteMapping("/coursesapi/courses/{student_id}")
 public HttpStatus deleteCourses(@PathVariable Long student_id);
}
