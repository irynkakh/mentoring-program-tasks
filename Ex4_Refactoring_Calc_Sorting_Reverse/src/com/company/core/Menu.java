package com.company.core;

import com.company.dto.CalculatorValues;
import com.company.dto.MenuOptions;
import com.company.dto.Operations;
import com.company.utils.Calculator;
import com.company.utils.ExtractValuesFromString;
import com.company.utils.Reader;
import com.company.utils.SortingOfArray;

import java.io.IOException;

public class Menu {
    Reader rd = new Reader();
    ExtractValuesFromString exval = new ExtractValuesFromString();

    public static MenuOptions getOption() throws InterruptedException {
        MenuOptions menuOptions;
        System.out.println("Select an option that you want and press ENTER: \n1) Calculator; \n2) Sorting of array; " +
                "\n3) Reversing of string \n4) Exit ");
        Reader rd = new Reader();
        char menu = rd.readChar();
        switch (menu) {
            case '1':
                menuOptions = MenuOptions.CALCULATION;
                break;
            case '2':
                menuOptions = MenuOptions.SORTING;
                break;
            case '3':
                menuOptions = MenuOptions.REVERSING;
                break;
            case '4':
                menuOptions = MenuOptions.EXITING;
                break;
            default: {
                System.out.println("Menu doesn't include this option. Please try again");
                Thread.sleep(1000);
                menuOptions = null;
            }
        }

        return menuOptions;
    }

    public static CalculatorValues getCalculationValues() {
        CalculatorValues calculatorValues = new CalculatorValues();

        Double number1 = Reader.readNumber();
        Operations operator = Reader.readOperator();
        Double number2 = Reader.readNumber();

        ExtractValuesFromString exval = new ExtractValuesFromString();

        calculatorValues.setNumber1(number1);
        calculatorValues.setNumber2(number2);
        calculatorValues.setCharacter(operator);

        return calculatorValues;
    }

    public static SortingOfArray getArray() {

        SortingOfArray sortOfArr = new SortingOfArray();
        String rd = Reader.readArray();
        ExtractValuesFromString exval = new ExtractValuesFromString();
        if (exval.doubleFromString(rd) == true) {

            sortOfArr.printArray(sortOfArr.sortingOfArray(exval.getArray()));
            System.out.println("MIN value in array is " + sortOfArr.minValueOfArray(exval.getArray()));
            System.out.println("MAX value in array is " + sortOfArr.maxValueOfArray(exval.getArray()));
        }

        return sortOfArr;
    }

    public static String getStringValue() {
        String str = Reader.readLine();
        return str;
    }

    public void showMenu() throws IOException, InterruptedException {
        System.out.println("Select an option that you want and press ENTER: 1) - Calculator 2) - Sorting of array 3) Exit ");
        Reader rd = new Reader();
        char menu = rd.readChar();
        switch (menu) {
            case '1':
                execCalculator();
                break;
            case '2':
                execSorting();
                break;
            case '3':
                exitApp();
                break;
            default: {
                System.out.println("Menu doesn't include this option. Please try again");
                Thread.sleep(1000);
                System.exit(1);
            }
        }

    }

    public void execCalculator() throws IOException {
        Double number1 = rd.readNumber();
        Operations operator = rd.readOperator();
        Double number2 = rd.readNumber();

        Calculator calc = new Calculator(number1, number2);

    }

    public void execSorting() throws IOException {

        SortingOfArray sortOfArr = new SortingOfArray();

        if (exval.doubleFromString(rd.readArray()) == true) {

            sortOfArr.printArray(sortOfArr.sortingOfArray(exval.getArray()));

            System.out.println("MIN value in array is " + sortOfArr.minValueOfArray(exval.getArray()));
            System.out.println("MAX value in array is " + sortOfArr.maxValueOfArray(exval.getArray()));
        }

    }

    public void exitApp() {
        System.out.println("Exit...");
        System.exit(0);
    }
}
