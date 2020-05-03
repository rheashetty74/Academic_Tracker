package com.iit.academictracker;

import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.repositories.RegistrationRepository;

import org.junit.Assert;
import org.junit.Test;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class AcademicTrackerUnitTest {

    /**
     * Tests RegistrationRepository's verification method to ensure "test" user registration failure.
     */
    @Test
    public void registrationVerificationTest() {
        Registration regTest = new Registration("100","Test","","","");
        RegistrationRepository registrationRepository = new RegistrationRepository();
        Assert.assertFalse(registrationRepository.verifyRegistrationInfo(regTest));
    }
}