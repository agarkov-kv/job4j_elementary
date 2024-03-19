package ru.job4j.javacore.loops115;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] num) {
        StringJoiner numb = new StringJoiner(" ");
        boolean found = false;
        for (int i = 0; i < num.length; i++) {
            int a1 = num[i];
            int num1 = a1 / 10 + a1 % 10;
            int a2 = num[i] * 2;
            int num2 = a2 / 10 + a2 % 10;
            if (num1 == num2) {
                numb.add(String.valueOf(num[i]));
                found = true;
            }
        }
        if (found) {
            System.out.println(numb);
        } else {
            System.out.println("Стабильных чисел нет");
        }
    }
}
