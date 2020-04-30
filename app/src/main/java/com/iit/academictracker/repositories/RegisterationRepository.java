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

public class RegisterationRepository {
    private String TAG = "RegistrationRepository";
    private SchoolServer server;

    public RegisterationRepository() {
        server = new SchoolServer();
    }

    public boolean verifyRegistrationInfo(Registration reg_info) {
        boolean response = server.verifyRegistrationInfo(reg_info);
        if (response) {
            Log.d(TAG, "User verified on server, registering user locally");
            registerUser(reg_info);
            return true;
        }
        return false;
    }

    private void registerUser(Registration reg_info) {
        User user_info = new User(
                reg_info.getStudentID(),
                reg_info.getName(),
                reg_info.getGradeLevel(),
                reg_info.getEmail()
        );

        //TO-DO: Save to Database
    }

}
