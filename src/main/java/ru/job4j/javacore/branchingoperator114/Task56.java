package ru.job4j.javacore.branchingoperator114;

public class Task56 {
    public static void isTriangle(int a, int b, int c) {
        int sumTriangleAB = a + b;
        int sumTriangleAC = a + c;
        int sumTriangleCB = c + b;
        if (c < sumTriangleAB && b < sumTriangleAC && a < sumTriangleCB) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
// 2 2 4
// ОР Нет