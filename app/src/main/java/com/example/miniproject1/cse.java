package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);
    }
    public void CSE1(View view)
    {
        Intent intent=new Intent(this,cse1.class);
        startActivity(intent);
    }
    public void CSE2(View view)
    {
        Intent intent=new Intent(this,cse2.class);
        startActivity(intent);
    }
    public void CSE3(View view)
    {
        Intent intent=new Intent(this,cse3.class);
        startActivity(intent);
    }
    public  void CSE4(View view)
    {
        Intent intent=new Intent(this,cse4.class);
        startActivity(intent);
    }
    public  void CSE5(View view)
    {
        Intent intent=new Intent(this,cse5.class);
        startActivity(intent);
    }
    public  void CSE6(View view)
    {
        Intent intent=new Intent(this,cse6.class);
        startActivity(intent);
    }
    public  void CSE7(View view)
    {
        Intent intent=new Intent(this,cse7.class);
        startActivity(intent);
    }
    public  void CSE8(View view)
    {
        Intent intent=new Intent(this,cse8.class);
        startActivity(intent);
    }
}