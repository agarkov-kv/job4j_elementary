package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner numb = new StringJoiner(" ");
        if (n >= m) {
            for (int i = m; i <= n; i++) {
                if (i % 2 == 0) {
                    numb.add(String.valueOf(i * 0));
                } else {
                    numb.add(String.valueOf(i * i));
                }
            }
        } else {
            for (int i = n; i <= m; i++) {
                if (i % 2 == 0) {
                    numb.add(String.valueOf(i * 0));
                } else {
                    numb.add(String.valueOf(i * i));
                }
            }
        }
        System.out.println(numb);
    }
}
