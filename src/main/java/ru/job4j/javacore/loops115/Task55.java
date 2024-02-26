package ru.job4j.javacore.loops115;

public class Task55 {
    public static void loop(int[] array) {
        int countM = 0;
        int countP = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                countM++;
            }
            if (i % 2 != 0) {
                countP++;
            }
        }
        System.out.println("Четных: " + countM + ", нечетных: " + countP);
    }
}
