package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner numb = new StringJoiner(" ");
        int number = 0;
        num = num * 2;
        for (int i = 0; i < num; i++) {
            numb.add(String.valueOf(number));
            number = number - 8;
        }
        System.out.println(numb);
    }
}
