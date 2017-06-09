package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {


    BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));


    public String readData()
    {
        System.out.println("Enter expression for calculation");
        String input = null;
        try {
            input = bufReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

    public char reader() throws IOException {

        return (char) bufReader.read();
    }

    public String readArray() throws IOException {

        System.out.println("Enter the list of numbers ");
        return bufReader.readLine();
    }

    public String readNumber() throws IOException {
        System.out.println("Enter number ");
        return (String) bufReader.readLine();
    }

    public String readOperator() throws IOException {
        System.out.println("Enter operation ");
        return (String) bufReader.readLine();
    }


}
