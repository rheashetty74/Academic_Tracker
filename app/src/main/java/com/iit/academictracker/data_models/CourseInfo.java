package com.iit.academictracker.data_models;

public class CourseInfo {
    public String courseID;
    public String courseName;
    public String instructorName;
    public String instructorEmail;
    public String taName;
    public String taEmail;
    public String location;
    public String time;
    public String description;

    public CourseInfo(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public CourseInfo(String courseID, String courseName, String instructorName, String instructorEmail, String taName, String taEmail, String location, String time, String description) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.instructorEmail = instructorEmail;
        this.taName = taName;
        this.taEmail = taEmail;
        this.location = location;
        this.time = time;
        this.description = description;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getTaName() {
        return taName;
    }

    public void setTaName(String taName) {
        this.taName = taName;
    }

    public String getTaEmail() {
        return taEmail;
    }

    public void setTaEmail(String taEmail) {
        this.taEmail = taEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
