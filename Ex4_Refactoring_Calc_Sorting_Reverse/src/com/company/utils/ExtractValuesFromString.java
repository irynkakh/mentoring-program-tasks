package com.company.utils;

public class ExtractValuesFromString {

    private String[] operator = {"/", "+", "-", "*"};
    private char operation;
    private double number1;
    private double number2;
    private double[] array;

    public double[] getArray() {
        return array;
    }


    public char getOperation() {
        return operation;
    }


    public Boolean presenceOperator(String str) {
        boolean res = false;

        for (int i = 0; i < operator.length; i++) {
            {
                if (str.indexOf(operator[i]) != -1) {
                    res = true;
                    operation = operator[i].charAt(0);
                    break;
                } else res = false;

            }
        }

        return res;
    }

    public Boolean checkIfNumber(String value) {
        boolean rez = true;
        double num;

        try {
            num = Double.parseDouble(value);

        } catch (NumberFormatException e) {
            rez = false;
            System.out.println("Input is not a number! Please, try again!");
        }

        return rez;
    }

    public Boolean checkIfNumbers(String[] values) {
        boolean rez = true;

        try {
            number1 = Double.parseDouble(values[0]);
            number2 = Double.parseDouble(values[1]);
        } catch (NumberFormatException e) {
            rez = false;
            System.out.println("Input is not a number! Please, try again!");
        }

        return rez;
    }


    public String[] extractValues(String str) {
        String values[] = null;

        if (presenceOperator(str) == true) {
            if (operation == '+') {
                values = str.split("\\+");
            } else if (operation == '-') {
                values = str.split("\\-");

            } else if (operation == '*') {
                values = str.split("\\*");

            } else if (operation == '/') {
                values = str.split("\\/");
            }
        } else System.out.println("Such operation is not implemented!");

        return values;
    }

    public Boolean doubleFromString(String str) {
        boolean rez = true;
        String[] value = null;

        value = str.split(" ");
        array = new double[value.length];
        try {
            for (int i = 0; i < value.length; i++)
                array[i] = Double.valueOf(value[i]);
        } catch (NumberFormatException e) {
            rez = false;
            System.out.println("Input is not a number! Please, try again!");
        }

        return rez;

    }

    public Object getNumberFromStr(String str) {
        double number = 0;
        try {
            number = Double.parseDouble(str);

        } catch (NumberFormatException e) {
            System.out.println("Input is not a number! Please, try again!");
        }

        return number;
    }


}

