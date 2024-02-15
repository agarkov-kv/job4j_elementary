package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        System.out.println("Старт");
        StringJoiner number = new StringJoiner(" ");
        for (int i = 100; i < 153; i++) {
            if (i % 10 == 7) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
        System.out.println("Финиш");
    }
}
