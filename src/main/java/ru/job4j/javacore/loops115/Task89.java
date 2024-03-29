package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner number = new StringJoiner(" ");
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            int numberOne = i / 100;
            int numberTwo = i % 100 / 10;
            int numberThree = i % 100 % 10;
            int arm = (int) (Math.pow(numberOne, 3) + Math.pow(numberTwo, 3) +  Math.pow(numberThree, 3));
            if (i == arm) {
                count++;
                number.add(String.valueOf(i));
            }
        }
        System.out.println("Числа: " + number + ", Количество: " + count);
    }
}
