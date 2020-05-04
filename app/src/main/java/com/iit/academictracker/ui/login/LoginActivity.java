package com.iit.academictracker.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.iit.academictracker.R;
import com.iit.academictracker.data_models.Login;
import com.iit.academictracker.ui.courseinfo.CourseInfoActivity;
import com.iit.academictracker.ui.registration.RegistrationActivity;
import com.iit.academictracker.ui.NavigationActivity;

public class LoginActivity extends AppCompatActivity {

    private String TAG = "LoginActivity";
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginViewModel = new LoginViewModel();

        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        final TextView loginStatus = findViewById(R.id.login_status);

        Button loginBtn = findViewById(R.id.login);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "password: "+password.getText().toString());
                Login loginInfo = new Login(email.getText().toString(),
                        password.getText().toString());
                boolean response = loginViewModel.verifyLoginInfo(loginInfo);
                if (response) {
                    Intent intent = new Intent(LoginActivity.this, CourseInfoActivity.class);
                    startActivity(intent);
                } else {
                    loginStatus.setText(getString(R.string.login_error));
                    loginStatus.setError("");
                    loginStatus.setTextColor(Color.RED);
                    password.setText("");
                }
            }
        });

        Button registerBtn = findViewById(R.id.register);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }

    //TODO: front end verification
}
