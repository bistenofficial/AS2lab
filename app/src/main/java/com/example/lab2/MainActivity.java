package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView helloTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloTv = (TextView) findViewById(R.id.hello_tv);
        TextView helloTv = (TextView) findViewById(R.id.hello_tv);
    }
    public void onclicked(View v) {
        switch (v.getId()) {

            case R.id.hello_btn:
                helloTv.setText("Обработка нажатия на кнопку ");
                break;
            case R.id.hello_tv:
                helloTv.setText("Нажали на TextView ");
                break;
        }

}}