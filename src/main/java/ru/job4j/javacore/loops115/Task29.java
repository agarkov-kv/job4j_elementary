package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 100; i < 150; i++) {
            int one = i % 100 % 10;
            int two = i % 100 / 10;
            int three = i / 100;
            if (one + two + three == num) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
