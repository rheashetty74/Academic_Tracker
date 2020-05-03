package com.iit.academictracker.ui.registration;

import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.repositories.RegistrationRepository;

/**
 * This ViewModel is used for registeration of the user.
 * It verifies the registration information through the repository and updates the activity.
 */

public class RegistrationViewModel {
    private RegistrationRepository regRepo;

    public RegistrationViewModel() {
        regRepo = new RegistrationRepository();
    }

    public boolean verifyRegistrationInfo(Registration regInfo) {
        return regRepo.verifyRegistrationInfo(regInfo);
    }
}
