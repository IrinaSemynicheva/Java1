package ru.gb.lessons;

/** Java 1. Homework 5
 *
 * @author Irina
 * @version 25.1.2022
 */
class Lesson5 {
    public static void main (String[] args) {
        Worker [] workers = {
            new Worker("Ivan", "Cook", "Ivan12@test.ru", 79997776655L, 67000, 30),
            new Worker("Boris", "Pilot", "Bor34@test.ru", 79083458877L, 300000, 41),
            new Worker("Inna", "QA", "Inna234@test.ru", 79912458899L, 120000, 35),
            new Worker("John", "Engineer", "J1234@test.ru", 79456459354L, 250000, 45),
            new Worker("Mary", "Nurse", "Mary@test.ru", 79098759123L, 25000, 25),
        };

        for (Worker worker : workers) {
            if (worker.getAge() > 40) {
                System.out.println (worker);
            }
        }
    }
}
class Worker {
    private String name;
    private String profession;
    private String email;
    private long number;
    private int salary;
    private int age;

    Worker (String name, String profession, String email, long number, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString () {
        return "Worker: " + name + ", " + profession + ", " + email + ", " + number + ", " + salary + ", " + age;
        }


}
