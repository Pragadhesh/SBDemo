package com.example.sbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import static com.example.sbdemo.R.layout.support_simple_spinner_dropdown_item;

public class Credentials1 extends AppCompatActivity {
    androidx.appcompat.widget.Toolbar toolbar_cred1;
    Spinner designation_spinner,states_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials1);
        toolbar_cred1 = (Toolbar) findViewById(R.id.toolbar_credentials1);
        toolbar_cred1.setNavigationIcon(R.drawable.ic_back);
        toolbar_cred1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });
        designation_spinner = findViewById(R.id.Designationspinner);
        String [] designations = {"Junior","Senior","SuperSenior"};
        ArrayList<String> designation = new ArrayList<>(Arrays.asList(designations));
        ArrayAdapter<String> arrayAdapterdesignation = new ArrayAdapter<>(this, support_simple_spinner_dropdown_item,designation);
        designation_spinner.setAdapter(arrayAdapterdesignation);
        states_spinner = findViewById(R.id.Statesspinner);
        String [] states = {"TamilNadu","Karnataka","Andhra Pradesh","Maharashtra"};
        ArrayList<String> state = new ArrayList<>(Arrays.asList(states));
        ArrayAdapter<String> arrayAdapterstates = new ArrayAdapter<>(this,support_simple_spinner_dropdown_item,state);
        states_spinner.setAdapter(arrayAdapterstates);
    }
    public void openhome()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}