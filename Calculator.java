/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package packageOne;

public class Calculator {
    
    private double num1;
    private double num2;

    // empty constructor
    public Calculator() {
    }

    // parameterised constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition
    public double add() {
        return num1 + num2;
    }

    // Subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Division
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0; // Return 0 for division by zero
    }

    // Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }




// main method
public static void main(String[] args) {
    // TODO code application logic here

    //create an instance of Calculator
    Calculator calculator = new Calculator(10, 5);
    //perform calculations
    System.out.println("Addition: " + calculator.add());    
    System.out.println("Subtraction: " + calculator.subtract());    
    System.out.println("Multiplication: " + calculator.multiply());    
    System.out.println("Division: " + calculator.divide());    

}

}