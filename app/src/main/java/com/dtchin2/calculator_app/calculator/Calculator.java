package com.dtchin2.calculator_app.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;

    public double add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public double subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public double multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public double divide(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
