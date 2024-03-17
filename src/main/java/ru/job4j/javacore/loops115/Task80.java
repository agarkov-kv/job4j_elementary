package ru.job4j.javacore.loops115;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0;
        double badAvg = 0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 3) {
                sumBad += grades[i];
                bad++;
            } else {
                sumGood += grades[i];
                good++;
            }
        }
        if (good > 0) {
            goodAvg = (double) sumGood / good;
        }
        if (bad > 0) {
            badAvg = (double) sumBad / bad;
        }
        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }
}
