package ru.job4j.javacore.onedimensionalarray1161;

public class Task1 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
