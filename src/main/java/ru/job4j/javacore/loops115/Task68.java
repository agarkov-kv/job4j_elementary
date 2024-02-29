package ru.job4j.javacore.loops115;

public class Task68 {
    public static void loop(int num1, int num2) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                count1++;
            }
        }
        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}