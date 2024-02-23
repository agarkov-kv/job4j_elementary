package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task48 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner("+");
        for (int i = 1; i <= num; i++) {
            numb.add(String.valueOf(i));
        }
        System.out.println(numb);
    }
}
