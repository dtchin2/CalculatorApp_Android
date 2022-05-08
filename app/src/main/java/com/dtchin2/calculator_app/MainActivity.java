package com.dtchin2.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dtchin2.calculator_app.calculator.Calculator;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberTxt = findViewById(R.id.firstNumber);
    EditText secondNumberTxt = findViewById(R.id.secondNumber);
    Button addBtn = findViewById(R.id.plusBtn);
    Button subBtn = findViewById(R.id.subBtn);
    Button multiBtn = findViewById(R.id.timesBtn);
    Button divideBtn = findViewById(R.id.divideBtn);
    Calculator calculator = new Calculator();

    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult(View view){


        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }

    public void setOperatorPlus(){
        this.setOperator("+");
    }

    public void setOperatorMinus(){
        this.setOperator("-");
    }

    public void setOperatorMulti(){
        this.setOperator("*");
    }

    public void setOperatorDivide(){
        this.setOperator("/");
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}