package ru.job4j.javacore.branchingoperator114;

public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        int disco = b * b - 4 * a * c;
        if (disco >= 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}