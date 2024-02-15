package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task17 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0 && i > 9) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
        System.out.println("Конец");
    }
}
