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

public class substraction extends AppCompatActivity {
    EditText es1,es2,es3;
    Button bt1,bt2;
    String getNum1,getNum2,result;
    Integer num1,num2,sum;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_substraction);
        es1=(EditText) findViewById(R.id.sno1);
        es2=(EditText) findViewById(R.id.sno2);
        bt1=(Button) findViewById(R.id.sub2);
        bt2=(Button) findViewById(R.id.bsub2);
        tv1=(TextView) findViewById(R.id.sno3);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oc=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oc);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=es1.getText().toString();
                getNum2=es2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1-num2;
                result=String.valueOf(sum);
                tv1.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });

    }
}