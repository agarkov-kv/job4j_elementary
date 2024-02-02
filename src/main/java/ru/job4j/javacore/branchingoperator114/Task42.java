package ru.job4j.javacore.branchingoperator114;

public class Task42 {
    public static void isPairSymmetric(int number) {
        int num1 = number / 100;
        int num2 = number % 100;
        if (num1 == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
