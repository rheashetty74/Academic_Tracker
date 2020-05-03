package com.iit.academictracker.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.view_models.RegistrationViewModel;
import com.iit.academictracker.view_models.RegistrationViewModel;

public class RegistrationActivity extends AppCompatActivity {

    private RegistrationViewModel registrationViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        registrationViewModel = new RegistrationViewModel();

        Button btn = findViewById(R.id.register);
        final EditText name = findViewById(R.id.name);
        final EditText email = findViewById(R.id.email);
        final EditText gradeLevel = findViewById(R.id.gradeLevel);
        final EditText studentID = findViewById(R.id.studentID);
        final EditText password = findViewById(R.id.password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Registration regInfo = new Registration(studentID.getText().toString(),
                        name.getText().toString(),
                        gradeLevel.getText().toString(),
                        email.getText().toString(),
                        password.getText().toString());

                boolean response = registrationViewModel.verifyRegistrationInfo(regInfo);

                if (response) {
                    Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                    //TO-DO: Go to next activity
                } else {
                    Toast.makeText(RegistrationActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //TO-DO: Front end verification
    }


}
