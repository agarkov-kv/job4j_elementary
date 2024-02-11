package ru.job4j.javacore.loops115;

public class Task6 {
    public static int mult(int a, int b) {
        int mult = 1;
        for (int i = a; i <= b; i++) {
            mult = i * mult;
        }
        return mult;
    }
}