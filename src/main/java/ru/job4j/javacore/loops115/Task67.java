package ru.job4j.javacore.loops115;

public class Task67 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
