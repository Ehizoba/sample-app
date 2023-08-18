package com.interswitch.maven;

import java.util.Scanner;

//
public class ArithmeticEngine {

    private double firstNumber;
    private double secondNumber;


    public ArithmeticEngine(double fn, double sn) {
        this.firstNumber = fn;
        this.secondNumber = sn;
    }

    public double addTwoNumbers() {
        return this.firstNumber + this.secondNumber;
    }

    public double subTwoNumbers() {
        return this.firstNumber - this.secondNumber;
    }

    public double mutTwoNumber(){
        return Math.pow(this.firstNumber, this.secondNumber);
    }
    public double multiplyTwoNumbers() {return this.firstNumber * this.secondNumber;}
    public double divideTwoNumbers() {
        if (this.secondNumber != 0) {
            return this.firstNumber / this.secondNumber;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

}


