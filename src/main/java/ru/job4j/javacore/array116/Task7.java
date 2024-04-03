package ru.job4j.javacore.array116;

public class Task7 {
    public static int[] calculate(int a, int b, int n) {
        int[] number = new int[n];
        number[0] = a;
        number[1] = b;
        number[2] = number[0] + number[1];
        for (int i = 3; i < number.length; i++) {
            number[i] = number[i - 1] * 2;
            }
        return number;
    }
}
