package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 1345; i < 1445; i++) {
            if (i / 1000 + i % 1000 / 100 == 5 && i % 1000 % 100 / 10 + i % 10 == 5) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
