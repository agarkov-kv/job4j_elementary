package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 1; i < 10; i++) {
            number.add(String.valueOf(i));
        }
        System.out.println(number);
        System.out.println("Финиш");
    }
}
