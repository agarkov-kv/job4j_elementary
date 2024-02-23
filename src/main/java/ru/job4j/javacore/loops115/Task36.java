package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 10; i < 30; i++) {
            if ((i % 10) * (i / 10) >= 10) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
