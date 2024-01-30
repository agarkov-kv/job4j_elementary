package ru.job4j.javacore.datatypes112;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int num1 = number1 / 100 * 100;
        int num2 = number2 / 100 * 100;
        int num3 = number1 % 100;
        int num4 = number2 % 100;
        System.out.println(num2 + num3);
        System.out.println(num1 + num4);
    }
}
