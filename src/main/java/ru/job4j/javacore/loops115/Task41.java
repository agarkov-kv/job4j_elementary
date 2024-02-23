package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task41 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 20; i < 36; i++) {
            if (i / 10 % 3 == i % 10 % 3) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
