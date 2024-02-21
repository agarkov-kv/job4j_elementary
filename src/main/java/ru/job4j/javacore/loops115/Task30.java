package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        int number = num % 10;
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 100; i < 130; i++) {

            if (number == i % 100 % 10) {
                numb.add(String.valueOf(i));
            }
        }
        System.out.println(numb);
    }
}
