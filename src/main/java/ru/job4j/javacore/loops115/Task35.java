package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = num - 6; i > num - 36; i = i - 6) {
            numb.add(String.valueOf(i));
        }
        System.out.println(numb);
    }
}
