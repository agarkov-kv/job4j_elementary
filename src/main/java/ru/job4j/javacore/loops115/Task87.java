package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task87 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        for (int i = 2; i < 70; i++) {
            int numberOne = i / 10 + i % 10;
            int numberOneCube = (int) Math.pow(numberOne, 3);
            int numberTwo = (int) Math.pow(i, 2);
            if (numberOneCube == numberTwo) {
                number.add(String.valueOf(i));
            }
        }
        System.out.println(number);
    }
}
