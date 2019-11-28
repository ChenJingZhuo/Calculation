package com.example.calculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bn_c=findViewById(R.id.bn_c);
    private Button bn_d=findViewById(R.id.bn_d);
    private Button bn_b=findViewById(R.id.bn_b);
    private Button bn_div=findViewById(R.id.bn_div);
    private Button bn_7=findViewById(R.id.bn_7);
    private Button bn_8=findViewById(R.id.bn_8);
    private Button bn_9=findViewById(R.id.bn_9);
    private Button bn_mul=findViewById(R.id.bn_mul);
    private Button bn_4=findViewById(R.id.bn_4);
    private Button bn_5=findViewById(R.id.bn_5);
    private Button bn_6=findViewById(R.id.bn_6);
    private Button bn_sub=findViewById(R.id.bn_sub);
    private Button bn_1=findViewById(R.id.bn_1);
    private Button bn_2=findViewById(R.id.bn_2);
    private Button bn_3=findViewById(R.id.bn_3);
    private Button bn_add=findViewById(R.id.bn_add);
    private Button bn_xkh=findViewById(R.id.bn_xkh);
    private Button bn_0=findViewById(R.id.bn_0);
    private Button bn_dian=findViewById(R.id.bn_dian);
    private Button bn_equal=findViewById(R.id.bn_equal);
    private TextView tv=findViewById(R.id.tv);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn_0.setOnClickListener(this);
        bn_1.setOnClickListener(this);
        bn_2.setOnClickListener(this);
        bn_3.setOnClickListener(this);
        bn_4.setOnClickListener(this);
        bn_5.setOnClickListener(this);
        bn_6.setOnClickListener(this);
        bn_7.setOnClickListener(this);
        bn_8.setOnClickListener(this);
        bn_9.setOnClickListener(this);
        bn_add.setOnClickListener(this);
        bn_sub.setOnClickListener(this);
        bn_mul.setOnClickListener(this);
        bn_div.setOnClickListener(this);
        bn_c.setOnClickListener(this);
        bn_d.setOnClickListener(this);
        bn_b.setOnClickListener(this);
        bn_xkh.setOnClickListener(this);
        bn_dian.setOnClickListener(this);
        bn_equal.setOnClickListener(this);
    }

    /*public void add(){
    }
    public void sub(){

    }
    public void mul(){

    }
    public void div(){

    }*/

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bn_0:
                tv.setText("0");
                break;
            case R.id.bn_1:
                tv.setText("1");
                break;
            case R.id.bn_2:
                tv.setText("2");
                break;
            case R.id.bn_3:
                tv.setText("3");
                break;
            case R.id.bn_4:
                tv.setText("4");
                break;
            case R.id.bn_5:
                tv.setText("5");
                break;
            case R.id.bn_6:
                tv.setText("6");
                break;
            case R.id.bn_7:
                tv.setText("7");
                break;
            case R.id.bn_8:
                tv.setText("8");
                break;
            case R.id.bn_9:
                tv.setText("9");
                break;
            case R.id.bn_c:
                tv.setText("C");
                break;
            case R.id.bn_d:
                tv.setText("←");
                break;
            case R.id.bn_b:
                tv.setText("%");
                break;
            case R.id.bn_div:
                tv.setText("÷");
                break;
            case R.id.bn_mul:
                tv.setText("×");
                break;
            case R.id.bn_sub:
                tv.setText("-");
                break;
            case R.id.bn_add:
                tv.setText("+");
                break;
            case R.id.bn_xkh:
                tv.setText("( )");
                break;
            case R.id.bn_dian:
                tv.setText(".");
                break;
            case R.id.bn_equal:
                tv.setText("=");
                break;
        }
    }
}
