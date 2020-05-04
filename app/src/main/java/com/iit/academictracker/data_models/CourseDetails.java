package com.iit.academictracker.data_models;

import java.util.ArrayList;

public class CourseDetails {

    private String courseID;
    private String instructorName;
    private String instructorEmail;
    private String taName;
    private String taEmail;
    private String location;
    private String time;
    private String description;
    private ArrayList<Assignment> assignments;

    public CourseDetails(String courseID, String instructorName, String instructorEmail, String taName, String taEmail, String location, String time, String description, ArrayList<Assignment> assignments) {
        this.courseID = courseID;
        this.instructorName = instructorName;
        this.instructorEmail = instructorEmail;
        this.taName = taName;
        this.taEmail = taEmail;
        this.location = location;
        this.time = time;
        this.description = description;
        this.assignments = assignments;
    }

    public CourseDetails(String courseID, ArrayList<Assignment> assignments) {
        this.courseID = courseID;
        this.assignments = assignments;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
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

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }
}
