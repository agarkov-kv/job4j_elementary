package ru.job4j.javacore.branchingoperator114;

public class Task41 {
    public static void rightCircleShift(int number) {
        int num1 = number % 100 % 10 * 100;
        int num2 = number / 100 * 10;
        int num3 = number % 100 / 10;
        int rightCircleShift = num1 + num2 + num3;
        System.out.println(rightCircleShift);
    }
}