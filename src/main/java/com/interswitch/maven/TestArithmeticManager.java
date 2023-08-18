package com.interswitch.maven;

import java.util.Scanner;

public class TestArithmeticManager {
    public static void main(String[] args) {
        try(Scanner scanInput= new Scanner(System.in)){
            System.out.println("Enter first number:");
            double firstNumber = scanInput.nextDouble();
            System.out.println("Enter second number:");
            double secondNumber = scanInput.nextDouble();


            ArithmeticEngine engine= new ArithmeticEngine(firstNumber, secondNumber);

            System.out.printf("%s + %s =%s", firstNumber, secondNumber, engine.addTwoNumbers());
            System.out.println();
            System.out.printf("%s - %s =%s", firstNumber, secondNumber, engine.subTwoNumbers());
            System.out.println();
            System.out.printf("%s * %s is = %s", firstNumber, secondNumber, engine.multiplyTwoNumbers());
            System.out.println();
            System.out.printf("%s / %s is = %s", firstNumber,secondNumber, engine.divideTwoNumbers());
            System.out.println();
            System.out.printf("%s power %s is  = %s", firstNumber, secondNumber, engine.mutTwoNumber());
            System.out.println();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}



