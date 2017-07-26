package com.company.utils;

public class ExtractValuesFromString {

    private double[] array;

    public double[] getArray() {
        return array;
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

}

