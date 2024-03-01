package ru.job4j.javacore.loops115;

public class Task71 {
    public static void loop(int num) {
        int sum = 1;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 || i % num == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
