package com.company;

import com.company.core.Menu;
import com.company.dto.CalculatorValues;
import com.company.dto.MenuOptions;
import com.company.utils.Calculator;
import com.company.utils.ReverseString;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        MenuOptions menuOptions;
        do {
            menuOptions = Menu.getOption();
            if (menuOptions == MenuOptions.CALCULATION) {
                CalculatorValues calculatorValues = Menu.getCalculationValues();
                Calculator calculator = new Calculator(calculatorValues);
                calculator.calculate();
            }
//            //TODO implement other options
            if (menuOptions == MenuOptions.REVERSING){
                ReverseString reverseString = new ReverseString();
                reverseString.reversing(Menu.getStringValue());
            }
        }
        while (menuOptions != MenuOptions.EXITING);

    }
}

