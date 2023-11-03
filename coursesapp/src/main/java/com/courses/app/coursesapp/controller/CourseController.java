package com.courses.app.coursesapp.controller;

import com.courses.app.coursesapp.entity.CourseEntity;
import com.courses.app.coursesapp.response.CourseResponse;
import com.courses.app.coursesapp.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/coursesapi")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping("/courses/{id}")
    public ResponseEntity<CourseEntity> getCoursesbyId(@PathVariable long id)
    {
       CourseEntity courseEntity = courseService.getcoursesbyId(id);
       return ResponseEntity.status(HttpStatus.OK).body(courseEntity);
    }
    @GetMapping("/registeredcourses/{studentid}")
    public ResponseEntity<List<CourseEntity>> getCoursesbystudentId(@PathVariable long studentid)
    {
        List<CourseEntity> courseEntity = courseService.getcoursesbystudentId(studentid);
        return ResponseEntity.status(HttpStatus.OK).body(courseEntity);
    }
    @GetMapping("/courses")
    public ResponseEntity<List<CourseEntity>> getAllcourses()
    {
        List<CourseEntity> courseEntity = courseService.getallcourses();
        return ResponseEntity.status(HttpStatus.OK).body(courseEntity);
    }
    @PostMapping("/courses/{student_id}")
    public HttpStatus postCourses(@PathVariable long student_id, @RequestBody CourseResponse courseResponse)
    {
     courseService.postcourses(student_id,courseResponse);
        return HttpStatus.ACCEPTED;
    }
    @PutMapping("/courses/{id}")
    public HttpStatus putCourses(@PathVariable Long id, @RequestBody CourseResponse courseResponse)
    {
        courseService.putcourses(id,courseResponse);
        return HttpStatus.ACCEPTED;
    }
    @DeleteMapping("/courses/{student_id}")
    public HttpStatus deleteCourses(@PathVariable Long student_id)
    {
        courseService.deleteCourses(student_id);
        return HttpStatus.OK;
    }
}
