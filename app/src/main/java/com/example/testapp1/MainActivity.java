package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editUsername;
    private EditText editPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUsername = findViewById(R.id.editUsername);
        editPassword = findViewById(R.id.editPassword);
    }

    public void loginClick(View view) {
        String str = "";
        str = "Name: " + editUsername.getText().toString();

        str+= "\nPass: "+ editPassword.getText().toString();

        Toast.makeText(this,str, Toast.LENGTH_SHORT).show(); // para q salga rapido y se vaya

    }
}