package ru.job4j.javacore.basiccodescheme110;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double sum = a + b;
        double diff = a - b;
        double mult = a * b;
        double div = a / b;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mult);
        System.out.println(div);
    }
}