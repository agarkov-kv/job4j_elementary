package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i > 9) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner.toString());
        System.out.println("Финиш");
    }
}
