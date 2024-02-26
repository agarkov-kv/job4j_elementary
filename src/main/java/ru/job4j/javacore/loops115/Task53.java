package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task53 {
    public static void loop(int n) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 1; i <= n; i++) {
            int number = (int) Math.pow(2, i);
            numb.add(String.valueOf(number));
        }
        System.out.println(numb);
    }
}
