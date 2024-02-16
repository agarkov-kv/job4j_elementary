package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task22 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        for (int i = 1; i < 300; i++) {
            if (i % 80 == 45 && i > 100) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
    }
}
