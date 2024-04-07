package ru.job4j.javacore.loops115;

public class Task96 {
    public static void loop(int[] num) {
        int best = 10000000;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < best) {
                best = num[i];
            }
        }
        System.out.println(best);
    }
}
