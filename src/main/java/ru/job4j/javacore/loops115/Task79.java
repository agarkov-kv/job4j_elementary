package ru.job4j.javacore.loops115;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] < 3) {
                bad += 1;
            }
        }
        avg = (double) sum / grades.length;
        System.out.println("Средняя оценка: " + avg + ", неуд. оценка: " + bad);
    }
}
