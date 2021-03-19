package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloTv;
    private Button forward;
    private EditText name;
    private EditText lastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloTv = (TextView) findViewById(R.id.hello_tv);
        TextView helloTv = (TextView) findViewById(R.id.hello_tv);
        forward = (Button) findViewById(R.id.hello_btn);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        lastname = (EditText) findViewById(R.id.editTextTextPersonName2);

    }
    public void goNewView(View v)
    {
switch (v.)
    }
}

