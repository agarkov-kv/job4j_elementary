package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if ((i / 10) * (i % 10) < num) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
