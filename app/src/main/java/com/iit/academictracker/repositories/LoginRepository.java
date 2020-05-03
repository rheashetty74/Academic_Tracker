package com.iit.academictracker.repositories;

import android.util.Log;

import com.iit.academictracker.SchoolServer;
import com.iit.academictracker.data_models.Login;
import com.iit.academictracker.data_models.User;

public class LoginRepository {
    private String TAG = "RegistrationRepository";
    private SchoolServer server;

    public LoginRepository() {
        server = new SchoolServer();
    }

    public boolean verifyLoginInfo(Login loginInfo) {
        boolean response = server.verifyLoginInfo(loginInfo);
        if (response) {
            Log.d(TAG, "User verified on server");
            return true;
        }
        return false;
    }
}
