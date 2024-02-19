package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        int number = 7;
        for (int i = 0; i < num; i++) {
            numb.add(String.valueOf(number));
            number = number + 4;
        }
        System.out.println(numb);
    }
}
