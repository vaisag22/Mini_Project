package com.example.miniproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cgpaactivity extends AppCompatActivity {


    EditText ed1;
    EditText ed2;
    EditText ed3;
    EditText ed4;
    EditText ed5;
    EditText ed6;
    EditText ed7;
    EditText ed8;
    EditText ed10;
    EditText ed11;
    EditText ed12;
    EditText ed13;
    EditText ed14;
    EditText ed15;
    EditText ed16;
    EditText ed17;
    EditText ed18;
    Button btn1,btn2;
    String[] item={"Semester 1","Semester 2","Semester 3 ","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};
    AutoCompleteTextView choose_Sem;
    String s="";
    ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpaactivity);

        choose_Sem=findViewById(R.id.choose_sem);
        adapter=new ArrayAdapter<String>(this,R.layout.list_item,item);
        choose_Sem.setAdapter(adapter);
        choose_Sem.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=adapterView.getItemAtPosition(i).toString();
                s=item;
                Toast.makeText(cgpaactivity.this,"Item: "+item,Toast.LENGTH_SHORT).show();

            }
        });

        ed1=findViewById(R.id.sem1);
        ed2=findViewById(R.id.sem2);
        ed3=findViewById(R.id.sem3);
        ed4=findViewById(R.id.sem4);
        ed5=findViewById(R.id.sem5);
        ed6=findViewById(R.id.sem6);
        ed7=findViewById(R.id.sem7);
        ed8=findViewById(R.id.sem8);
        ed10=findViewById(R.id.res);
        ed11=findViewById(R.id.sem1c1);
        ed12=findViewById(R.id.sem1c2);
        ed13=findViewById(R.id.sem1c3);
        ed14=findViewById(R.id.sem1c4);
        ed15=findViewById(R.id.sem1c5);
        ed16=findViewById(R.id.sem1c6);
        ed17=findViewById(R.id.sem1c7);
        ed18=findViewById(R.id.sem1c8);
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
        double m1,m2,m3,m4,m5,m6,m7,m8,c,res;
        Integer c1,c2,c3,c4,c5,c6,c7,c8;
        m1=Double.parseDouble(ed1.getText().toString());
        m2=Double.parseDouble(ed2.getText().toString());
        m3=Double.parseDouble(ed3.getText().toString());
        m4=Double.parseDouble(ed4.getText().toString());
        m5=Double.parseDouble(ed5.getText().toString());
        m6=Double.parseDouble(ed6.getText().toString());
        m7=Double.parseDouble(ed7.getText().toString());
        m8=Double.parseDouble(ed8.getText().toString());
        c1=Integer.parseInt(ed11.getText().toString());
        c2=Integer.parseInt(ed12.getText().toString());
        c3=Integer.parseInt(ed13.getText().toString());
        c4=Integer.parseInt(ed14.getText().toString());
        c5=Integer.parseInt(ed15.getText().toString());
        c6=Integer.parseInt(ed16.getText().toString());
        c7=Integer.parseInt(ed17.getText().toString());
        c8=Integer.parseInt(ed18.getText().toString());
        double a[]={m1,m2,m3,m4,m5,m6,m7,m8};
        Integer b[]={c1,c2,c3,c4,c5,c6,c7,c8};
        c=0;
        int n=0;
        double tot=0;
        for(int i=0;i<8;i++)
        {
            if(item[i].equals(s))
            {
                n=i;
            }
        }
        for(int i=0;i<=n;i++)
        {
            tot+=(a[i]*b[i]);
            c+=b[i];
        }
        res=tot/(double)c;
        ed10.setText(String.valueOf(res).substring(0,5));
    }
    public  void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed5.setText("");
        ed6.setText("");
        ed7.setText("");
        ed8.setText("");
        ed10.setText("");
        ed11.setText("");
        ed12.setText("");
        ed13.setText("");
        ed14.setText("");
        ed15.setText("");
        ed16.setText("");
        ed17.setText("");
        ed18.setText("");
        ed1.requestFocus();
    }
    public void Credits(View view)
    {
        Intent intent=new Intent(this,credits.class);
        startActivity(intent);
    }
}