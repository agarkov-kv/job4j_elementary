package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 200; i <= 223; i++) {
            int one = i / 100;
            int two = i % 100 / 10;
            int three = i % 100 % 10;
            if (one % 2 == 0 && two % 2 == 0 && three % 2 == 0) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
