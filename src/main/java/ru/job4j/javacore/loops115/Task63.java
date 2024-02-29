package ru.job4j.javacore.loops115;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        int countYes = 0;
        for (int answer : answers) {
            count++;
            if (answer == 1) {
                countYes++;
            }
        }
        if (countYes > count - countYes) {
            String result = "Да";
            System.out.println(countYes + ", " + result);
        } else {
            String result = "Нет";
            System.out.println(countYes + ", " + result);
        }
    }
}
