package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonClick(View view) {
        Intent intent = new Intent(this, cgpaactivity.class);
        startActivity(intent);
    }
    public void onSgpaClick(View view){
        Intent intent=new Intent(this,sgpaactivity.class);
        startActivity(intent);
    }
    }