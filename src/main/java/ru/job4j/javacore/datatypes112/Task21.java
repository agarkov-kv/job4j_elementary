package ru.job4j.javacore.datatypes112;

public class Task21 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 =  number / 100;
        num2 =  number / 10 % 10;
        num3 =  number % 100 % 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
