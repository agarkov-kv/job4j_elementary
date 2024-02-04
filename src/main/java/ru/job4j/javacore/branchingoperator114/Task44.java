package ru.job4j.javacore.branchingoperator114;

public class Task44 {
    public static void getRoundNumber(int number) {
        int num1 = number % 10;
        if (num1 < 5) {
            System.out.println(number - num1);
        } else {
            System.out.println((10 - num1) + number);
        }
    }
}
