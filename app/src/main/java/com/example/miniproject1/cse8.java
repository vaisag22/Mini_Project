package com.example.miniproject1;

import static com.example.miniproject1.R.id.btn1;
import static com.example.miniproject1.R.id.btn3;
import static com.example.miniproject1.R.id.cs8res;
import static com.example.miniproject1.R.id.cs8s1;
import static com.example.miniproject1.R.id.cs8s2;
import static com.example.miniproject1.R.id.cs8s3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class cse8 extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    Button btn1;
    Button btn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse8);
        ed1=findViewById(cs8s1);
        ed2=findViewById(cs8s2);
        ed3=findViewById(cs8s3);
        ed4=findViewById(cs8res);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ok();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }
    public void ok()
    {
        String s1=ed1.getText().toString();
        String s2=ed2.getText().toString();
        String s3=ed3.getText().toString();
        String s4=s1;
        String a[]={"O","A+","A","B+","B"};
        Integer b[]={10,9,8,7,6};
        Integer credits[]={3,3,6};
        DecimalFormat df=new DecimalFormat("0.000");
        String s[]={s1,s2,s3};
        Integer arrears=0,tot=0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals("RF"))
            {
                arrears+=credits[i];
            }
            else
            {
                for(int j=0;j<a.length;j++)
                {
                    if(s[i].equals(a[j]))
                    {
                        tot+=(b[j]*credits[i]);
                    }
                }
            }
        }
        Integer minus=12-arrears;
        Integer res=tot/minus;
        String ans=df.format(res);
        ed4.setText(ans);
    }
    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed1.requestFocus();
    }
    public void Credits(View view)
    {
        Intent intent=new Intent(this,credits.class);
        startActivity(intent);
    }
}