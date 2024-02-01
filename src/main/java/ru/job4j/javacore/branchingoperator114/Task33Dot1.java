package ru.job4j.javacore.branchingoperator114;

public class Task33Dot1 {
    public static void evenAmount(int number) {
        int num1, num2, num3, counter = 0;
        if (number / 100 % 2 == 0) {
            counter += 1;
        }
        if (number / 10 % 10 % 2 == 0) {
            counter += 1;
        }
        if (number % 100  % 10 % 2 == 0) {
            counter += 1;
        }
        System.out.println(counter);
    }
}
