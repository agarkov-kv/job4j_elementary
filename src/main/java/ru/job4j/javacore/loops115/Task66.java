package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                numb.add(String.valueOf(i));
            }
        }
        if (count != 0) {
            System.out.println("Количество: " + count + ", Делители: " + numb);
        } else {
             int i = 0;
            System.out.println("Количество: " + count + ", Делители: " + i);
        }
    }
}

