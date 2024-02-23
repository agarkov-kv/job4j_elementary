package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task43 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 300; i < 326; i++) {
            if ((i % 100) % (i / 100) == 0 && i % 100 > 10) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
