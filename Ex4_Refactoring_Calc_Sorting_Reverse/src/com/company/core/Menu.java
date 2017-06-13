package com.company.core;

import com.company.dto.CalculatorValues;
import com.company.dto.MenuOptions;
import com.company.utils.Calculator;
import com.company.utils.ExtractValuesFromString;
import com.company.utils.Reader;
import com.company.utils.SortingOfArray;

import java.io.IOException;

public class Menu {
    Reader rd = new Reader();
    ExtractValuesFromString exval = new ExtractValuesFromString();

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
        String number1 = rd.readNumber();
        String operator = rd.readOperator();
        String number2 = rd.readNumber();


        if (exval.checkIfNumber(number1) && exval.presenceOperator(operator) && exval.checkIfNumber(number2)) {
            Calculator calc = new Calculator((double) exval.getNumberFromStr(number1), (double) exval.getNumberFromStr(number2));
            calc.calculation(exval.getOperation());

        }
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

        String number1 = Reader.readNumber();
        String operator = Reader.readOperator();
        String number2 = Reader.readNumber();

        ExtractValuesFromString exval = new ExtractValuesFromString();

        if (exval.checkIfNumber(number1) && exval.presenceOperator(operator) && exval.checkIfNumber(number2)) {
            calculatorValues.setNumber1(exval.getNumberFromStr(number1));
            calculatorValues.setNumber2(exval.getNumberFromStr(number2));
            calculatorValues.setCharacter(exval.getOperation());
        }

        return calculatorValues;
    }

    public static String getStringValue()
    {
        String str = Reader.readLine();
        return str;
    }
}
