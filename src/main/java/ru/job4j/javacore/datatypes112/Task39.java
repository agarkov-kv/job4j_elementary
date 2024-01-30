package ru.job4j.javacore.datatypes112;

public class Task39 {
    public static void leftCircleShift(int number) {
       int num1 = number / 100;
       int num2 = number % 100 / 10 * 100;
       int num3 = number % 100 % 10 * 10;
       int leftCircleShift = num1 + num2 + num3;
       System.out.println(leftCircleShift);
    }
}
