package ru.job4j.javacore.datatypes112;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int num1 = number1 % 10;
        int num2 = number2 % 10;
        int num3 = number1 / 10 * 10;
        int num4 = number2 / 10 * 10;
        System.out.println(num2 + num3);
        System.out.println(num1 + num4);
    }
}
