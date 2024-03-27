package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        for (int i = 10; i < 20; i++) {
            if (i % 4 == 0) {
                number.add(String.valueOf(i + "#"));
            } else if (i % 2 == 0) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println("Начало");
        System.out.println(number);
        System.out.println("Конец");
    }
}
