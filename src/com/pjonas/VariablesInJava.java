package com.pjonas;

public class VariablesInJava {
    public static void main(String[] args) {
        /*
        declaration of variables

        {type} {nameVariable} {operator of attribution} {value}
         */
        // primitives - store simple values
        int number1 = 20;
        int number2 = 15;
        int result = number1 + number2;
        System.out.println(result);
        double pi = 3.14;
        boolean isAdult = true; // true or false
        char a = 'A';

        // representing big numbers
        int amount = 1_000_000_008;
        System.out.println(amount);
    }
}
