package com.pjonas;

public class ComparisonOperators {
    public static void main(String[] args) {
        // Comparison operators
        // < <= > >= == !=
        // the return of comparison operations is a boolean
        int number1 = 10;
        int number2 = 10;

        System.out.println(number1 > number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 < number2);
        System.out.println(number1 <= number2);
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);

        System.out.println();
        int ageAdult = 18;
        int ageUser = 17;
        boolean isAdult = ageUser >= ageAdult;
        System.out.println(isAdult);
    }
}
