package ru.job4j.javacore.loops115;

public class Task10 {
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }
}
