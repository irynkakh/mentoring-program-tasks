package com.company.utils;

import com.company.dto.CalculatorValues;

public class Calculator {

    private double a;
    private double b;
    private char sign;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator(CalculatorValues calculatorValues) {
        this.a = calculatorValues.getNumber1();
        this.b = calculatorValues.getNumber2();
        this.sign = calculatorValues.getCharacter();
    }

    public void calculate() {
        calculation(sign);
    }

    private double addition(double a, double b) {
        return a + b;
    }

    private double subtraction(double a, double b) {
        return a - b;
    }

    private double multiplication(double a, double b) {
        return a * b;
    }

    private Object division(double a, double b) {
        double rez = 0;
        if (b != 0)
            return rez = a / b;
        else return "Number is divided by zero!";

    }

    public void calculation(char sign) {
        switch (sign) {
            case '+':
                System.out.println(a + "+" + b + " = " + addition(a, b));
                break;
            case '-':
                System.out.println(a + "-" + b + " = " + subtraction(a, b));
                break;
            case '*':
                System.out.println(a + "*" + b + " = " + multiplication(a, b));
                break;
            case '/':
                System.out.println(a + "/" + b + " = " + division(a, b));
                break;
            default:
                System.out.println("Such operation is not implemented");
        }
    }
}
