package com.iit.academictracker.data_models;

public class Registration {

    private String name;
    private String gradeLevel;
    private String studentID;
    private String email;
    private String password;

    public Registration(String studentID, String name, String gradeLevel, String email, String password) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.studentID = studentID;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
