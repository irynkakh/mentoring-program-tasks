package com.company;

import javax.management.DynamicMBean;
import java.util.Scanner;

/**
 * Created by Iryna_Khomyn on 5/31/2017.
 */
public class Calculator {
    private double number;
    private char operation;

    public double readNumber ()
    {
        System.out.println("Please, enter the number");
        Scanner input = new Scanner(System.in);
        number = input.nextDouble();
        return number;
    }

    public char readOperation()
    {
        System.out.println("Please, enter the operation");
        Scanner input = new Scanner(System.in);
        operation = input.next().charAt(0);
        return operation;
    }

    private double addition (double a, double b)
    {
        return a+b;
    }

    private double subtraction (double a, double b)
    {
        return a-b;
    }

    private double multiplication (double a, double b)
    {
        return a*b;
    }

    private double division (double a, double b)
    {
        return a/b;
    }

    public void selectTheOperation (double a, char sign, double b)
    {
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
                System.out.println(a + "/" + b + " = " +  division(a, b));
                break;
            default:
                System.out.println("Such operation is not implemented");
        }
    }
}
