package ru.job4j.javacore.branchingoperator114;

public class Task27 {
    public static void isEnough(int pupils, int chairs) {
        if (pupils / 2 <= chairs || pupils == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
