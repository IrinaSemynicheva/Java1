package ru.gb.lessons;

/** Java 1. Homework 2
 *
 * @author Irina
 * @version 16.1.2022
*/

public class Lesson2 {

    public static void main (String [] args) {
        System.out.println (within10and20 (5, 6));
        isPositiveOrNegative (9);
        System.out.println (isNegative (-5));
        printWordNTimes ();
    }

    static boolean within10and20 (int a, int b) {
        return 10 < a + b <= 20;
    }

    static void isPositiveOrNegative (int c) {
        System.out.println (c > 0? "Positive" : "Negative");
    }

    static boolean isNegative (int d) {
        return d > 0;
    }

    static void printWordNTimes (String a, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println (a);
        }
    }
}
