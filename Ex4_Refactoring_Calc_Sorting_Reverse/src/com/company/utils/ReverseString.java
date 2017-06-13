package com.company.utils;

import java.lang.Character;

public class ReverseString {

    public static void reversing(String str) {

        char[] reserv = null;

        reserv = str.toCharArray();

        for (int i = str.length() - 1; i >= 0; i--) {
            for (int j = 0; j < str.length(); j++) {
                reserv[j] = str.charAt(i);
            }
            System.out.print(reserv[i]);
        }
        System.out.println("\n");
    }


}
