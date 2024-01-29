package ru.job4j.javacore.branchingoperator114;

public class Task36 {
        public static void firstLastChange(int number) {
            int first, middle, last;
            first = number / 1000;
            middle = number % 1000 / 10;
            last = number % 100 % 10;
            int result = last * 1000 + middle * 10 + first;
            System.out.println(result);
        }
}