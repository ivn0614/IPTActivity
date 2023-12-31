package com.example.sariegoipt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String enteredUsername = username.getText().toString();
                String enteredPassword = password.getText().toString();

                if(enteredUsername.equals("ivan") && enteredPassword.equals("ivan")){
                    // Correct credentials, redirect to another activity
                    Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }
                else {
                    // Incorrect credentials
                    Toast.makeText(MainActivity.this, "Incorrect Email or Password!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}