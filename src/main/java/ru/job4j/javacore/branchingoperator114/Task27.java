package ru.job4j.javacore.branchingoperator114;

public class Task27 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number % 100 % 10 * 100;
        num2 = number % 100 / 10 * 10;
        num3 = number / 100;
        System.out.println(num3 + num2 + num1 - 20);
    }
}
