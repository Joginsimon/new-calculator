package com.example.newcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class adddss extends AppCompatActivity {
    EditText e01,e02;
    Button b01,b02;
    TextView e03;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_adddss);
        e01=(EditText) findViewById(R.id.ano1);
        e02=(EditText)  findViewById(R.id.ano2);
        e03=(TextView) findViewById(R.id.ano3);
        b01=(Button)  findViewById(R.id.add1);
        b02=(Button)  findViewById(R.id.badd2);


        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oa=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oa);
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=e01.getText().toString();
                getNum2=e02.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                e03.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
    }
}