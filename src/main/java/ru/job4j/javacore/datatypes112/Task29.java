package ru.job4j.javacore.datatypes112;

public class Task29 {
    public static void numSum(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number % 100 / 10;
        num3 = number % 100 % 10;
        System.out.println(num2 + num1 + num3);
    }
}


