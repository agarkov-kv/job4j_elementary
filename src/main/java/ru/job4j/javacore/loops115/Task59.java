package ru.job4j.javacore.loops115;

public class Task59 {
    public static void loop(int num, int[] array) {
        int countEquals = 0;
        int countLess = 0;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                countEquals++;
            }
            if (num > array[i]) {
                countLess++;
            }
        }
        System.out.println("Равно: " + countEquals + ", меньше: " + countLess);
    }
}
