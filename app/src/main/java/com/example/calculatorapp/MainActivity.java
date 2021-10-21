package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    ImageView btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9 ;
    ImageView btn_plus, btn_minus, btn_multiply, btn_divide, btn_ac, btn_equal, btn_dot;
    TextView InputText, OutputText ;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0= findViewById(R.id.btn_0);
        btn_1= findViewById(R.id.btn_1);
        btn_2= findViewById(R.id.btn_2);
        btn_3= findViewById(R.id.btn_3);
        btn_4= findViewById(R.id.btn_4);
        btn_5= findViewById(R.id.btn_5);
        btn_6= findViewById(R.id.btn_6);
        btn_7= findViewById(R.id.btn_7);
        btn_8= findViewById(R.id.btn_8);
        btn_9= findViewById(R.id.btn_9);


        btn_ac= findViewById(R.id.btn_ac);
        btn_divide= findViewById(R.id.btn_divide);
        btn_multiply= findViewById(R.id.btn_multiplication);
        btn_plus= findViewById(R.id.btn_plus);
        btn_minus= findViewById(R.id.btn_minus);
        btn_equal= findViewById(R.id.btn_equal);
        btn_dot= findViewById(R.id.btn_dot);

        InputText= findViewById(R.id.Inputext);
        OutputText= findViewById(R.id.outputText);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"9");
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputText.setText("");
                OutputText.setText("");
                Toast.makeText(MainActivity.this, "     Value Erased     ", Toast.LENGTH_SHORT).show();
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"/");
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"x");
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"+");
            }
        });

        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+"-");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();
                InputText.setText(data+".");
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data= InputText.getText().toString();

                data=data.replaceAll("x", "*");

                Context rhino= Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalresult="";

                Scriptable scriptable= rhino.initStandardObjects();

                finalresult= rhino.evaluateString(scriptable,data,"Javascript",1, null).toString();

                OutputText.setText(finalresult);


            }
        });













    }
}