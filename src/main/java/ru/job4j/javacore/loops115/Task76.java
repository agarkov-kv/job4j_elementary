package ru.job4j.javacore.loops115;

public class Task76 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        if (num1 > num2) {
            for (int i = 1; i < num1; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    sum = sum + i;
                }
            }
        } else {
            for (int i = 1; i < num2; i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    sum = sum + i;
                }
            }
        }
        if (sum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
