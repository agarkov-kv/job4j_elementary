package ru.job4j.javacore.branchingoperator114;

public class Task17 {
    public static void signCheck(int number) {
        if (number == 0) {
            System.out.println("Ноль");
        }
        if (number > 0) {
            System.out.println("Положительное");
        }
        if (number < 0) {
            System.out.println("Отрицательное");
        }
    }
}
