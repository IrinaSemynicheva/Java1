package ru.gb.lesson1;

public class Lesson1 {
    public static void main(String[] agrs) {
        printThreeWorlds();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    public static void printThreeWorlds ()

    {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSing()

    {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println(c >= 0 ? "Сумма положительная!" : "Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println ("Красный"); {
        if (value>0 && value <= 100)
            System.out.println ("Желтый"); {
        if (value > 100)
            System.out.println ("Зеленый");
            }
            }
    }

    public static void compareNumbers() {
        int a = 8;
        int b = 9;
        if (a>=b)
            System.out.println("a>=b");
        else System.out.println ("a<b");
    }

}