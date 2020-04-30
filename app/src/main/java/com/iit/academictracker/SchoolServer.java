package com.iit.academictracker;

import com.iit.academictracker.data_models.Registration;

import java.util.ArrayList;

/**
 * This class stubs out the network calls and replaces the server.
 * It accepts requests from the repository and gives information as replies.
 */

public class SchoolServer {

    private ArrayList<Registration> registered_students;

    public SchoolServer() {
        registered_students = new ArrayList<>();
        populateRegisteredStudents();
    }

    public boolean verifyRegistrationInfo(Registration reg_info) {
        for (Registration students : registered_students) {
            if (reg_info.getStudentID().equals(students.getStudentID())) {
                return true;
            }
        }
        return false;
    }

    private void populateRegisteredStudents() {
        registered_students.add(new Registration("1", "Rhea", "Masters", "rhea@iit.com"));
        registered_students.add(new Registration("2", "Rupa", "Masters", "rupa@iit.com"));
        registered_students.add(new Registration("3", "Sharan", "Masters", "sharan@iit.com"));
        registered_students.add(new Registration("4", "Jordan", "PhD", "jordan@iit.com"));
        registered_students.add(new Registration("5", "Nico", "Freshman", "nico@iit.com"));
    }
}
