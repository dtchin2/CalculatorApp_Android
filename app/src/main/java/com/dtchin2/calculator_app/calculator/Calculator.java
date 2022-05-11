package com.dtchin2.calculator_app.calculator;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
