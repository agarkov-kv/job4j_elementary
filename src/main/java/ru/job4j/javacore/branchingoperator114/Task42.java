package ru.job4j.javacore.branchingoperator114;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1 = number % 1000 % 100 % 10 * 1000;
        int num2 = number / 1000 * 100;
        int num3 = number % 1000 / 100 * 10;
        int num4 = number % 1000 % 100 / 10;
        int rightCircleShift = num1 + num2 + num3 + num4;
        System.out.println(rightCircleShift);
    }
}
