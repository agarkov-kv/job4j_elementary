package ru.job4j.javacore.loops115;

public class Task73 {
    public static void loop(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
