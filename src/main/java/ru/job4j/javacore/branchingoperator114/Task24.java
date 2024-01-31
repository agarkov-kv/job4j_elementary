package ru.job4j.javacore.branchingoperator114;

public class Task24 {
    public static void isPositive(int num1, int num2) {
        if (num1 > 0 && num2 > 0 || num1 < 1 && num2 < 1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
