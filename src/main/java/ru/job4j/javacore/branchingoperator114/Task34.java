package ru.job4j.javacore.branchingoperator114;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number / 1000 % 2;
        num2 = number % 1000 / 100 % 2;
        num3 = number % 1000 % 100 / 10 % 2;
        num4 = number % 1000 % 100 % 10 % 2;
        System.out.println(counter - (num1 + num2 + num3 + num4));
    }
}
