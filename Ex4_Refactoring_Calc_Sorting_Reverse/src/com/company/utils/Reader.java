package com.company.utils;

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

    public static String readNumber() {
        System.out.println("Enter number ");
        //TODO: rewrite. Method should return Double. Should be only valid value.
        return readLine();
    }

    public static String readOperator() {
        System.out.println("Enter operation ");
        //TODO: rewrite. Method should return Enum. Should be only valid value.
        return readLine();
    }

}
