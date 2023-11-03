package com.courses.app.coursesapp.service;

import com.courses.app.coursesapp.entity.CourseEntity;
import com.courses.app.coursesapp.exception.CourseNotFoundException;
import com.courses.app.coursesapp.repository.CourseRepo;
import com.courses.app.coursesapp.response.CourseResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    ModelMapper modelMapper;

   @Autowired
    CourseRepo courseRepo;
    public CourseEntity getcoursesbyId(long id) {
       CourseEntity courseEntity =  courseRepo.findById(id).get();
       return courseEntity;
    }

    public List<CourseEntity> getallcourses() {
        Iterable<CourseEntity> courseEntities = courseRepo.findAll();
        return (List<CourseEntity>) courseEntities;
    }
    public void postcourses(long student_id , CourseResponse courseResponse) {
        CourseEntity courseEntity = modelMapper.map(courseResponse,CourseEntity.class);
        courseEntity.setStudent_id(student_id);
        courseRepo.save(courseEntity);
    }
    public List<CourseEntity> getcoursesbystudentId(long studentid) {

        List<CourseEntity> courseEntity = (List<CourseEntity>) courseRepo.findbystudentid(studentid);
        System.out.println(courseEntity);
        return courseEntity;
    }
    public void putcourses(Long id , CourseResponse courseResponse) {
        CourseEntity courseEntity = courseRepo.findById(id).orElseThrow
                (()->new CourseNotFoundException("Course doesnt exists with id"+id));
        courseEntity.setCourseName(courseResponse.getCourseName());
        courseEntity.setEnddate(courseResponse.getEnddate());
        courseEntity.setPrice(courseResponse.getPrice());
        courseEntity.setStartdate(courseResponse.getStartdate());
        courseEntity.setRegistered(courseResponse.getRegistered());
        courseRepo.save(courseEntity);
    }

    public void deleteCourses(Long student_id) {
       List<CourseEntity> courseEntity =  courseRepo.findbystudentid(student_id);
        courseEntity.forEach(e->courseRepo.delete(e));

    }
}
