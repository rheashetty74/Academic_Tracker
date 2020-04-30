package com.iit.academictracker.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.view_models.RegistrationViewModel;

public class RegistrationActivity extends AppCompatActivity {

    private RegistrationViewModel registrationViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registrationViewModel = new RegistrationViewModel();
        Button btn = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean response = registrationViewModel.verifyRegistrationInfo(new Registration("1", "Test", "Test", "test@iit.edu"));
                if (response) {
                    Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    //TO-DO: Go to next activity
                } else {
                    Toast.makeText(RegistrationActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
