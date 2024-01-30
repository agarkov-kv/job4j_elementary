package ru.job4j.javacore.branchingoperator114;

public class Task13 {
    public static String checkNumber(int number) {
        int a = number % 3;
        int b = number % 5;
        boolean aa = b == 0;
        boolean bb = a == 0;
        if (aa && bb) {
            return "Hello, World!!!";
        }
        if (aa) {
            return "World";
        }
        if (bb) {
            return "Hello";
        }
        return "Operation not support";
    }
}
