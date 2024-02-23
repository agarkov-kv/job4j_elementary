package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 1000; i < 1500; i++) {
            if (i % 1000 / 10 == num) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
