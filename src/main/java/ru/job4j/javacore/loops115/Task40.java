package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 20; i < 41; i++) {
            if (i / 10 % 3 == 0 && i % 10 % 3 == 0) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
