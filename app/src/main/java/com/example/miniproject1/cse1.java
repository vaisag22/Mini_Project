package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cse1 extends AppCompatActivity {

    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;
    EditText ed7;
    EditText ed8;
    EditText ed9;
    Button btn1,btn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse1);

        ed1=findViewById(R.id.cs1s1);
        ed2=findViewById(R.id.cs1s2);
        ed3=findViewById(R.id.cs1s3);
        ed4=findViewById(R.id.cs1s4);
        ed5=findViewById(R.id.cs1s5);
        ed6=findViewById(R.id.cs1s6);
        ed7=findViewById(R.id.cs1s7);
        ed8=findViewById(R.id.cs1s8);
        ed9=findViewById(R.id.cs1res);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               clear();
            }
        });
    }
    public void markscal()
    {
        String s1,s2,s3,s4,s5,s6,s7,s8;
        double res;
        s1=ed1.getText().toString();
        s2=ed2.getText().toString();
        s3=ed3.getText().toString();
        s4=ed4.getText().toString();
        s5=ed5.getText().toString();
        s6=ed6.getText().toString();
        s7=ed7.getText().toString();
        s8=ed8.getText().toString();
        String subjects[]={s1,s2,s3,s4,s5,s6,s7,s8};
        Integer credits[]={3,3,3,3,4,1,1,1};
        String grade[]={"O","A+","A","B+","B"};
        Integer point[]={10,9,8,7,6};
        Integer tot=0,arrear=0;
        for(int i=0;i< subjects.length;i++)
        {
            if(!subjects[i].equals("RF"))
            {
                for(int j=0;j< grade.length;j++)
                {
                    if(grade[j].equals(subjects[i]))
                    {
                        tot+=point[j]*credits[i];
                    }
                }
            }
            else if (subjects[i].equals("RF"))
            {
                arrear+=credits[i];
            }
        }
        Integer earned=19-arrear;
        res=(double)tot/earned;
        ed9.setText(String.valueOf(res).substring(0,5));
    }
    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");
        ed8.setText("");
        ed9.setText("");
        ed1.requestFocus();
    }
    public void Credits(View view)
    {
        Intent intent=new Intent(this,credits.class);
        startActivity(intent);
    }
}