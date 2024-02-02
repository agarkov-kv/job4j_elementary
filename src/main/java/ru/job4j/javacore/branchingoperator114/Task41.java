package ru.job4j.javacore.branchingoperator114;

public class Task41 {
    public static void evenDigitsAmount(int number) {
        int counter = 0;
        int num1, num2, num3;
        if (number / 100 % 2 == 0) {
            counter += 1;
        }
        if (number % 100 / 10 % 2 == 0) {
            counter += 1;
        }
        if (number % 100 % 10 % 2 == 0) {
            counter += 1;
        }
        System.out.println(counter);
    }
}
