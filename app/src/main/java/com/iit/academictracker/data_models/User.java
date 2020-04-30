package com.iit.academictracker.data_models;

public class User {
    private String uID;
    private String name;
    private String gradeLevel;
    private String email;

    public User(String uID, String name, String gradeLevel, String email) {
        this.uID = uID;
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.email = email;
    }

    public String getuID() {
        return uID;
    }

    public void setuID(String uID) {
        this.uID = uID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
