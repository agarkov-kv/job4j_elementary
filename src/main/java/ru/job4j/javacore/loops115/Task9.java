package ru.job4j.javacore.loops115;

public class Task9 {
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
