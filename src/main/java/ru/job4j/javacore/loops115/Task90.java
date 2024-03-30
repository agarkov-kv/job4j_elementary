package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        int count = 0;
        int sum = 0;
        StringJoiner numbers = new StringJoiner(" ");
        for (int i = 10; i < 100; i++) {
            int numberOne = i / 10;
            int numberTwo = i % 10;
            if ((numberOne + numberTwo) * 2 == numberOne * numberTwo) {
                count++;
                sum += i;
                numbers.add(String.valueOf(i));
            }
        }
        System.out.println("Числа: " + numbers + ", Количество: " + count + ", Сумма: " + sum);
    }
}
