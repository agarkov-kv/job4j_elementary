package ru.job4j.javacore.loops115;

public class Task57 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
