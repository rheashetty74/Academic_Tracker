package com.iit.academictracker.view_models;

import com.iit.academictracker.data_models.Login;
import com.iit.academictracker.repositories.LoginRepository;

public class LoginViewModel {
    private LoginRepository loginRepo;

    public LoginViewModel() {
        loginRepo = new LoginRepository();
    }

    public boolean verifyLoginInfo(Login loginInfo) {
        return loginRepo.verifyLoginInfo(loginInfo);
    }
}
