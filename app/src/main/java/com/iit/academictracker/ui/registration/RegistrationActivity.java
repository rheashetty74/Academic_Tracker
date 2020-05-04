package com.iit.academictracker.ui.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Registration;
import com.iit.academictracker.ui.NavigationActivity;
import com.iit.academictracker.ui.courseinfo.CourseInfoActivity;

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
                    Intent intent = new Intent(RegistrationActivity.this, CourseInfoActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(RegistrationActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //TODO: Front end verification
    }


}
