package ru.job4j.javacore.branchingoperator114;

public class Task38 {
    public static void isSymmetric(int number) {
        int num1 = number / 100;
        int num2 = number % 100 % 10;
        if (num2 == num1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
