package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 38; i > 9; i--) {
            if (i % 5 == 0) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
        System.out.println("Финиш");
    }
}
