package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        System.out.println("Начало");
        StringJoiner number = new StringJoiner(" ");
        for (int i = 1550; i > 1050; i--) {
            if (i % 100 == 0) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
        System.out.println("Конец");
    }
}
