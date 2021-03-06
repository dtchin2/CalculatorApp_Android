package com.dtchin2.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.dtchin2.calculator_app.calculator.Calculator;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberTxt;
    EditText secondNumberTxt;
    TextView resultTextView;

    String operator = "";
    Calculator calculator = new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNumberTxt = findViewById(R.id.firstNumber);
        secondNumberTxt = findViewById(R.id.secondNumber);
        resultTextView = findViewById(R.id.result);
    }

    public void getResult(View view){
        Double firstNumber = Double.parseDouble(firstNumberTxt.getText().toString());
        Double secondNumber = Double.parseDouble(secondNumberTxt.getText().toString());
        double result = 0;

        switch (operator){
            case "+":
                result = calculator.add(firstNumber, secondNumber);
                break;
            case "-":
                result = calculator.subtract(firstNumber,secondNumber);
                break;
            case "*":
                result = calculator.multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = calculator.divide(firstNumber, secondNumber);
                break;
            default:
                Toast.makeText(this, "Invalid Operation", Toast.LENGTH_SHORT).show();
                result = 0;
                break;
        }


        resultTextView.setText(String.valueOf(result));
    }

    public void setOperatorPlus(View view){
        this.setOperator("+");
    }

    public void setOperatorMinus(View view){
        this.setOperator("-");
    }

    public void setOperatorMulti(View view){
        this.setOperator("*");
    }

    public void setOperatorDivide(View view){
        this.setOperator("/");
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}