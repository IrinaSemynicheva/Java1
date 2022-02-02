package ru.gb.lessons;

/** Java 1. Homework 6
 *
 * @author Irina
 * @version 1.2.2022
 */


public class Lesson6 {

    public static void main (String [] args) {
        Cat cat = new Cat (200);
        Dog dog = new Dog (500, 10);

        IAnimal[] animals = {cat,dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(300));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(7));
            System.out.println(animal.swim(13));

        }
    }
}

class Cat extends Animal {
    Cat (int runMax, int swimMax) {
        super(runMax, swimMax);
    }

    Cat (int runMax) {
        super(runMax, -1);
    }


    public  String swim (int distance) {
        return getClassName() + " can't swim";
    }
}

class Dog extends Animal {
    Dog (int runMax, int swimMax) {
        super(runMax, swimMax);
    }
}

abstract class Animal implements IAnimal {
    protected int runMax;
    protected int swimMax;
    protected String className;

    Animal(int runMax, int swimMax) {
        this.runMax = runMax;
        this.swimMax = swimMax;
        className = getClass().getSimpleName();
    }

    public String getClassName() {
        return className;
    }

    public String run(int distance) {
        if (distance > runMax) {
            return className + " couldn't run " + distance;
        } else {
            return className + " successful run" + distance;
        }
    }

    public String swim(int distance) {
        if (distance > swimMax) {
            return className + " couldn't swim " + distance;
        } else {
            return className + " successful swim" + distance;
        }
    }


    public String toSrting () {
        return className + ". runMax: " + runMax + ". swimMax" + swimMax;
    }
}

interface  IAnimal {
    String run (int distance);
    String swim (int distance);
}
