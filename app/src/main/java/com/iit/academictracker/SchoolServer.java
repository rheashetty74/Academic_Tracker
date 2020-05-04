package com.iit.academictracker;

import com.iit.academictracker.data_models.Login;
import com.iit.academictracker.data_models.Registration;

import java.util.ArrayList;

/**
 * This class stubs out the network calls and replaces the server.
 * It accepts requests from the repository and gives information as replies.
 */

public class SchoolServer {

    private ArrayList<Registration> registeredStudents;

    public SchoolServer() {
        registeredStudents = new ArrayList<>();
        populateRegisteredStudents();
    }

    public boolean verifyRegistrationInfo(Registration regInfo) {
        String studentID = regInfo.getStudentID();
        String name = regInfo.getName();
        String email = regInfo.getEmail();
        String gradeLevel = regInfo.getGradeLevel();

        for (Registration students : registeredStudents) {
            //TODO: override comparator to compare both objects
            if (students.getStudentID().equals(studentID) &&
                    students.getName().equals(name) &&
                    students.getEmail().equals(email) &&
                    students.getGradeLevel().equals(gradeLevel)) {
                return true;
            }
        }
        return false;
    }

    public boolean verifyLoginInfo(Login loginInfo) {
        String email = loginInfo.getEmail();
        String password = loginInfo.getPassword();

        for (Registration students : registeredStudents) {
            if (students.getEmail().equals(email) &&
                    students.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private void populateRegisteredStudents() {
        registeredStudents.add(new Registration("1", "Rhea", "Masters", "rhea@iit.edu", "rhea123"));
        registeredStudents.add(new Registration("2", "Rupa", "Masters", "rupa@iit.edu", "rupa123"));
        registeredStudents.add(new Registration("3", "Sharan", "Masters", "sharan@iit.edu", "sharan123"));
        registeredStudents.add(new Registration("4", "Jordan", "PhD", "jordan@iit.edu", "jordan123"));
        registeredStudents.add(new Registration("5", "Nico", "Freshman", "nico@iit.edu", "nico123"));
    }
}
