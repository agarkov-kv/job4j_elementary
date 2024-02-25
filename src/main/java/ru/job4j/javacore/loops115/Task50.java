package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 1; i < n * 5 + 1; i++) {
            numb.add(String.valueOf(i));
            i = i + n - 1;
        }
        System.out.println(numb);
    }
}
