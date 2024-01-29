package ru.job4j.javacore.branchingoperator114;

public class Task40 {
    public static void leftCircleShift(int number) {
        int num1 = number / 1000;
        int num2 = number % 100 % 10 * 10;
        int num3 = number % 1000 % 100 / 10 * 100;
        int num4 = number % 1000 / 100 * 1000;
        int leftCircleShift = num1 + num2 + num3 + num4;
        System.out.println(leftCircleShift);
    }
}
