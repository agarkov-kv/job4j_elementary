package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner number = new StringJoiner(" ");
        num++;
        for (int i = num; i < num + 5; i++) {
                number.add(String.valueOf(i));
        }
        System.out.println(number);
    }
}
