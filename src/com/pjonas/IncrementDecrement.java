package com.pjonas;

public class IncrementDecrement {

    public static void main(String[] args) {
        int number = 0;
        /*
        int increment = number + 1;
        int decrement = number - 1;
         */

        // increment operator
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);

        int numberTwo = 0;
        // decrement operator
        System.out.println(numberTwo--);
        System.out.println(numberTwo);
        System.out.println(--numberTwo);

        int numberThree = 4;
        // shorthand reassingment
        numberTwo += numberThree;
        System.out.println(numberTwo);

        numberTwo *= numberThree;
        System.out.println(numberTwo);
    }
}
