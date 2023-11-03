package com.students.app.studentsapp.studentrepo;

import com.students.app.studentsapp.studententity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
}
