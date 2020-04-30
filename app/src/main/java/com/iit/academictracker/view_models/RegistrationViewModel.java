package com.iit.academictracker.view_models;

import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.repositories.RegisterationRepository;

/**
 * This ViewModel is used for registeration of the user.
 * It verifies the registration information through the repository and updates the activity.
 */

public class RegistrationViewModel {
    private RegisterationRepository reg_repo;

    public RegistrationViewModel() {
        reg_repo = new RegisterationRepository();
    }

    public boolean verifyRegistrationInfo(Registration reg_info) {
        return reg_repo.verifyRegistrationInfo(reg_info);
    }
}
