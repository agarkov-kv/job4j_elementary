package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner numb = new StringJoiner("+");
        while (n > m) {
            if (m % 2 == 0) {
                numb.add(String.valueOf(m));
            }
            m++;
        }
        while (n <= m) {
            if (n % 2 == 0) {
                numb.add(String.valueOf(n));
            }
            n++;
        }
        System.out.println(numb);
    }
}
