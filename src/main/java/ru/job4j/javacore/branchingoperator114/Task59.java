package ru.job4j.javacore.branchingoperator114;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        if (a == 0 && b > 0 || a > 0 && b == 0) {
            System.out.println("Нет решения");
        } else if (a == 0 || b == 0) {
            System.out.println("Бесконечное множество");
        } else {
            System.out.println(-b * 1.0 / a);
        }
    }
}