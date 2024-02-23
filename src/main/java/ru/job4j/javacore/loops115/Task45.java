package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 100; i < 500; i = i + 100) {
            numb.add(String.valueOf(i + num));
        }
        System.out.println(numb);
    }
}
