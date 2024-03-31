package ru.job4j.javacore.loops115;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        int step = n2 - n1;
        if (n2 + n1 == n3) {
            n1 = step * 4;
            n2 = step * 5;
            n3 = step * 6;
            System.out.println(n1 + " " + n2 + " " + n3);
        } else {
            System.out.println("Нет");
        }
    }
}
