package ru.job4j.javacore.loops115;

public class Task75 {
    public static void loop(int num) {
        int count = 1;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                count++;
            }
        }
        if (sum % count == 0 && num % count == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
