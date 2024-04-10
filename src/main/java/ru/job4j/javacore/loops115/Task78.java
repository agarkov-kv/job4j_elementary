package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        StringJoiner number = new StringJoiner(" ");
        boolean divisibleFound = false;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        if (hundreds != 0 && num % hundreds == 0) {
            number.add(String.valueOf(hundreds));
            divisibleFound = true;
        }
        if (tens != 0 && num % tens == 0) {
            number.add(String.valueOf(tens));
            divisibleFound = true;
        }
        if (ones != 0 && num % ones == 0) {
            number.add(String.valueOf(ones));
            divisibleFound = true;
        }
        if (divisibleFound) {
            System.out.println(number.toString());
        } else {
            System.out.println("Таких чисел нет");
        }
    }
}
