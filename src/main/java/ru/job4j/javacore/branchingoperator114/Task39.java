package ru.job4j.javacore.branchingoperator114;

public class Task39 {
    public static void numsCompare(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        if (num1 > num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
