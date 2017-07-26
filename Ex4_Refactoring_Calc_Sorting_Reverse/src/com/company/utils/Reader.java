package com.company.utils;

import com.company.dto.Operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static String readLine() {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        do {
            try {
                line = bufReader.readLine();
            } catch (IOException e) {
                System.out.println("Incorrect value entered, please try again. Error: " + e.getMessage());
            }
        }
        while (line == null);
        return line;
    }

    public static char readChar() {

        return readLine().charAt(0);
    }

    public static String readArray() {
        System.out.println("Enter the list of numbers ");
        return readLine();
    }


    public static Double readNumber() {
        System.out.println("Enter number ");
        String str = readLine();
        Double num = null;
        try {
            num = Double.parseDouble(str);

        } catch (NumberFormatException e) {
            System.out.println("Input is not a number! Please, try again!");
        }
        return num;
    }

    public static Operations readOperator() {
        System.out.println("Enter operation ");
        Character str = readLine().charAt(0);
        Operations operations = null;
        if (str == '+')
            operations = Operations.ADDITION;
        else if (str == '-')
            operations = Operations.SUBSTRACTION;
        else if (str == '*')
            operations = Operations.MULTIPLICATION;
        else if (str == '/')
            operations = Operations.DIVISION;
        else System.out.println("Such operation is not implemented!");

        return operations;
    }

}
