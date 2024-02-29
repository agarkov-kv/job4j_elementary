package ru.job4j.javacore.loops115;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 2) {
                count++;
            }
        }
        if (count >= amount - count) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
