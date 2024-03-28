package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner numbers = new StringJoiner(" ");
        int count = 0;
        for (int i = 1; i < 100; i++) {
            int numberOne = i / 10;
            int numberTwo = i % 10;
            if (numberOne * numberTwo * 3 == i) {
                count++;
                numbers.add(String.valueOf(i));
            }
        }
        System.out.println("Числа: " +  numbers + ", Количество: " + count);
    }
}
