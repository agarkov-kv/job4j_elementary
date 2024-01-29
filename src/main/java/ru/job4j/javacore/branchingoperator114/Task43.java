package ru.job4j.javacore.branchingoperator114;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num1 = number1 / 10 * 10;
        int num2 = number2 % 100 % 10;
        int num3 = number2 / 10 * 10;
        int num4 = number1 % 100 % 10;
        System.out.println(num1 + num2);
        System.out.println(num3 + num4);
    }
}
