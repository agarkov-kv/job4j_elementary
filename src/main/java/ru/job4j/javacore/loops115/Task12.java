package ru.job4j.javacore.loops115;

public class Task12 {
    public static int mod(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        return n;
    }
}
// 8 3