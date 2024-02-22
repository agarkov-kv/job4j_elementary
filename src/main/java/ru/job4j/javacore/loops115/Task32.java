package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        int num = 7;
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 50; i >= 10; i--) {
            if (i % 10 == num) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
