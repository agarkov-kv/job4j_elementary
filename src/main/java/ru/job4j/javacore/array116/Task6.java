package ru.job4j.javacore.array116;

public class Task6 {
    public static String random(String[] prizes, int num) {
        while (num > prizes.length) {
            num = num - prizes.length;
        }
        return prizes[num - 1];
    }
}
