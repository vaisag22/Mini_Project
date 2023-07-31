package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sgpaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpaactivity);
    }
    public void CSE(View view)
    {
        Intent intent=new Intent(this,cse.class);
        startActivity(intent);
    }
}