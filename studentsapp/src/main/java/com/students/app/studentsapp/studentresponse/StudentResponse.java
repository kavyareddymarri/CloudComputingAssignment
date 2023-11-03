package com.students.app.studentsapp.studentresponse;

public class StudentResponse {
    private Long id;
    private String name;
    private String email;
    private String mobilenumber;
    private CourseResponse courseResponse;
    public StudentResponse()
    {}
    public StudentResponse(Long id , String name , String email , String mobilenumber , CourseResponse courseResponse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobilenumber = mobilenumber;
        this.courseResponse = courseResponse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public CourseResponse getCourseResponse() {
        return courseResponse;
    }

    public void setCourseResponse(CourseResponse courseResponse) {
        this.courseResponse = courseResponse;
    }

    @Override
    public String toString() {
        return "StudentResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobilenumber='" + mobilenumber + '\'' +
                ", courseResponse=" + courseResponse +
                '}';
    }
}
