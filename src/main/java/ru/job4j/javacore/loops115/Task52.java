package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner numb = new StringJoiner(" ");
        if (n < m) {
            for (int i = m; i < m + n; i++) {
                numb.add(String.valueOf(i));
            }
        } else {
            for (int i = n; i < n + m; i++) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
