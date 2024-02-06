package ru.job4j.javacore.branchingoperator114;

public class Task55 {
    public static void apartmentPlace(int number) {
        if (number % 3 == 0) {
            System.out.println(number / 3);
        } else {
            System.out.println(number / 3 + 1);
        }
        if (number % 3 == 0) {
            System.out.println(3);
        } else {
            System.out.println(number % 3);
        }
    }
}
