package com.courses.app.coursesapp.repository;

import com.courses.app.coursesapp.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity,Long>{

  // @Query(nativeQuery = true,value = "select cs.courseid, cs.course_name,cs.startdate,cs.enddate,cs.price,cs.registered from courses.course_entity cs join customers.student_entity std on std.id=cs.student_id where cs.student_id=:studentid")
   @Query(nativeQuery = true,value = "select * from courses.course_entity cs join students.student_entity std on std.id=cs.student_id where cs.student_id=:studentid")
   List<CourseEntity> findbystudentid(@Param("studentid") Long studentid);


}
