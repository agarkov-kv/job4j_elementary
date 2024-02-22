package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task33 {
    public static void loop() {
        int num = 11;
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 100; i < 160; i++) {
            if (i % num == 0) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
