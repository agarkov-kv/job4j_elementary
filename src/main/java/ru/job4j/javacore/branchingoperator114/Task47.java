package ru.job4j.javacore.branchingoperator114;

public class Task47 {
    public static void changeNum(int number) {
        if (number > 500) {
            System.out.println(number % 10 * 100 + number % 100 / 10 * 10 + number / 100);
        } else {
            System.out.println(number / 100 * 100 + number % 10 * 10 + number % 100 / 10);
        }
    }
}
