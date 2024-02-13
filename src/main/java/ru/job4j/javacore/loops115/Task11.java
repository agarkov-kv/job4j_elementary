package ru.job4j.javacore.loops115;

public class Task11 {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            length = length - section;
            count++;
        }
        return count;
    }
}
