package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task28 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            int one = i % 10;
            int two = i / 10;
            if (one + two == num) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
