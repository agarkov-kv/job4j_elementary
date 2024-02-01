package ru.job4j.javacore.branchingoperator114;

public class Task39 {
    public static void isDoubleEven(int number) {
        int num1 = number / 100;
        int num2 = number % 100 / 10;
        int num3 = number % 100 % 10;
        if (number % 2 == 0 && (num1 + num2 + num3) % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
