package ru.job4j.javacore.loops115;

public class Task74 {
    public static void loop(int num) {
        int sum = 1;
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        if (sum % 2 == 0 && num % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
