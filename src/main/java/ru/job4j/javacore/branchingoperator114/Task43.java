package ru.job4j.javacore.branchingoperator114;

public class Task43 {
    public static void containsZero(int number) {
        if (number % 100 / 10 == 0) {
            System.out.println("Да");
        } else if (number % 100 % 10 / 1 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
