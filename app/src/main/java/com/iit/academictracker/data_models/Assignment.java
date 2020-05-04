package com.iit.academictracker.data_models;

public class Assignment {
    private String id;
    private String deadline;
    private String grade;

    public Assignment(String id, String deadline, String grade) {
        this.id = id;
        this.deadline = deadline;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
