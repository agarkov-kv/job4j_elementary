package ru.job4j.javacore.branchingoperator114;

public class Task19 {
    public static void numCheck(int number) {
        if (number >= 100 && number / 100 % 2 == 0 && number / 10 % 2 == 0 && number % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
