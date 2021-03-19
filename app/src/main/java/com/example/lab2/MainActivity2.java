package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private Button back;
private TextView name;
private TextView lastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        back = (Button) findViewById(R.id.buttonback);
        name = (TextView) findViewById(R.id.textViewname);
        lastname = (TextView) findViewById(R.id.textViewlastname);
    }
}