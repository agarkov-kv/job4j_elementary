package ru.job4j.javacore.loops115;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int sum = 0;
        int a3 = a1 + a2;
        for (int i = 1; i < num; i++) {
            sum = sum + a3;
        }
        System.out.println(sum);
    }
}

// a1 = 5
// a2 = 8
// num = 3
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,