package com.iit.academictracker.repositories;

import android.util.Log;

import com.iit.academictracker.SchoolServer;
import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.data_models.User;

/**
 * This class talks to the server to verify registration information provided by the user.
 * After user has been verified, it registers tehe student by creating a User object and saving it
 * to the database
 */

public class RegistrationRepository {
    private String TAG = "RegistrationRepository";
    private SchoolServer server;

    public RegistrationRepository() {
        server = new SchoolServer();
    }

    public boolean verifyRegistrationInfo(Registration regInfo) {
        boolean response = server.verifyRegistrationInfo(regInfo);
        if (response) {
            Log.d(TAG, "User verified on server, registering user locally");
            registerUser(regInfo);
            return true;
        }
        return false;
    }

    private void registerUser(Registration regInfo) {
        User userInfo = new User(
                regInfo.getStudentID(),
                regInfo.getName(),
                regInfo.getGradeLevel(),
                regInfo.getEmail()
        );

        //TO-DO: Save to Database
    }

}
