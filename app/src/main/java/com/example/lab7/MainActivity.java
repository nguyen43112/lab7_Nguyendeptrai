package com.example.lab7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void bai1(View view) {
        Intent intent = new Intent(getApplicationContext(), bai1.class);
        startActivity(intent);
    }

    public void bai2(View view) {
        Intent intent = new Intent(getApplicationContext(), bai2.class);
        startActivity(intent);
    }
    public void bai3(View view) {
        Intent intent = new Intent(getApplicationContext(), bai3.class);
        startActivity(intent);
    }
}
