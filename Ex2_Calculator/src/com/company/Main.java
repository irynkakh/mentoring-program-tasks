package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        double a, b;
        char operation;

        a = obj.readNumber();
        operation = obj.readOperation();
        b = obj.readNumber();

        obj.selectTheOperation(a, operation, b);

    }
}
