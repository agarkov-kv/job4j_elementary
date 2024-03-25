package ru.job4j.javacore.array116;

import java.util.StringJoiner;

public class Task1 {
    public static void printCrossEl(int[] left, int[] right) {
        StringJoiner owned = new StringJoiner(" ");
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    owned.add(String.valueOf(left[i]));
                }
            }
        }
        if (owned.length() > 0) {
            System.out.println(owned);
        }
    }
}
