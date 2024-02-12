package ru.job4j.javacore.loops115;

public class Task7 {
    public static int calculate(int a, int n) {
        int mult = a;
        for (int i = 1; i < n; i++) {
            mult *= a;
        }
        return mult;
    }
}