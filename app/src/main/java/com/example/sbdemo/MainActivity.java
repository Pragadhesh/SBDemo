package com.example.sbdemo;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signup = (Button) findViewById(R.id.Signupbutton);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencredentials();
            }
        });

    }
    public void opencredentials()
    {
        Intent intent = new Intent(this,Credentials1.class);
        startActivity(intent);
    }
}