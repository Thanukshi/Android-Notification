package com.example.androidnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {


    EditText view;
    Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        view = findViewById(R.id.ET_main);
        signUp = findViewById(R.id.btn_Main);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(Signup.this, Register.class);
                String name = view.getText().toString();
                send.putExtra("FullName", name);
                startActivity(send);
            }
        });


    }
}
