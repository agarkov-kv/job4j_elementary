package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner number = new StringJoiner(" ");
        for (int i = num - 10; i > num - 40; i = i - 6) {
            number.add(String.valueOf(i));
        }
        System.out.println(number);
    }
}
