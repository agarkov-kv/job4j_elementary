package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double triangleHeight = p / (2 * (k + 1));
        double triangleLength = triangleHeight * k;
        return triangleLength * triangleHeight;
    }

    public static void main(String[] args) {
        double result = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result);
    }
}