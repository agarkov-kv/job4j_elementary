package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;
        double xPow = Math.pow(xDiff, 2);
        double yPow = Math.pow(yDiff, 2);
        double sum = xPow + yPow;
        return Math.sqrt(sum);
    }

    public static void main(String[] args) {
        double result = Point.distance(3, 6, 6, 8);
        System.out.println("result (3, 6) to (6, 8) " + result);
    }
}
