package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 200; i <= 210; i++) {
            int one = i / 100;
            int two = i % 100 / 10;
            int three = i % 100 % 10;
            if (i % (one + two + three) == 0) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
