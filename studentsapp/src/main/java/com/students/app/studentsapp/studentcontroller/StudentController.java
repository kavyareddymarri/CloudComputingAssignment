package com.students.app.studentsapp.studentcontroller;

import com.students.app.studentsapp.studententity.StudentEntity;
import com.students.app.studentsapp.studentresponse.StudentResponse;
import com.students.app.studentsapp.studentservice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/studentsapi")
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentResponse> getStudentbyId(@PathVariable long id)
    {
       StudentResponse studentResponse = studentService.getstudentsbyid(id);
       return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(studentResponse);
    }
    @GetMapping("/students")
    public ResponseEntity<List<StudentResponse>> getallStudent()
    {
       List< StudentResponse> studentResponse = studentService.getallstudents();
        return ResponseEntity.status(HttpStatus.OK).header("Access-Control-Allow-Origin","*").body(studentResponse);
    }
    @PostMapping("/students")
    public HttpStatus postStudent(@RequestBody  StudentResponse studentResponse)
    {
        studentService.poststudents(studentResponse);
        return HttpStatus.CREATED;
    }
    @PutMapping("/students/{id}")
    public HttpStatus updateStudent(@PathVariable Long id, @RequestBody  StudentResponse studentResponse)
    {
        studentService.updatestudents(id, studentResponse);
        return HttpStatus.CREATED;
    }
    @DeleteMapping("/students/{id}")
    public HttpStatus deleteStudent(@PathVariable Long id)
    {
        studentService.deletestudents(id);
        return HttpStatus.OK;
    }
}
