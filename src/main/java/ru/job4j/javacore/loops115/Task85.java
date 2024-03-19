package ru.job4j.javacore.loops115;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = ((double) percent / 100 + 1)  * money;
        for (int i = 2; i <= months; i++) {
            sum = sum * ((double) percent / 100 + 1);
        }
        System.out.printf("%.2f\n", sum);
    }
}
