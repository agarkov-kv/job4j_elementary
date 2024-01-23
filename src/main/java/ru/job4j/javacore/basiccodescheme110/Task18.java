package ru.job4j.javacore.basiccodescheme110;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double p = 4 * a;
        double circle = 2 * Math.PI * r;
        double circleP = Math.PI * Math.pow(r, 2);

        System.out.printf("%.1f%n", p);
        System.out.printf("%.1f%n", circle);
        System.out.printf("%.1f%n", circleP);
    }
}
