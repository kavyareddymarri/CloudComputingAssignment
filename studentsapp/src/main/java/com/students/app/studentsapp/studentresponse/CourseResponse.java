package com.students.app.studentsapp.studentresponse;

public class CourseResponse {

    private Long courseid;
    private String courseName;
    private String startdate;
    private String enddate;
    private String registered;
    private long price;
    private long student_id;

    public CourseResponse()
    {}

    public CourseResponse(Long courseid , String courseName , String startdate , String enddate , String registered , long price , long student_id) {
        this.courseid = courseid;
        this.courseName = courseName;
        this.startdate = startdate;
        this.enddate = enddate;
        this.registered = registered;
        this.price = price;
        this.student_id = student_id;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "CourseResponse{" +
                "courseid=" + courseid +
                ", courseName='" + courseName + '\'' +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", registered='" + registered + '\'' +
                ", price=" + price +
                ", student_id=" + student_id +
                '}';
    }
}
