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
            System.out.println(countYes + ", " + "Да");
        } else {
            System.out.println(countYes + ", " + "Нет");
        }
    }
}
