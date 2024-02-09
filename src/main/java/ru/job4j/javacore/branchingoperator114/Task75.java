package ru.job4j.javacore.branchingoperator114;

public class Task75 {
    public static void sameNumAmount(int num) {
        int count = 0;
        int numberOne = num / 100;
        int numberTwo = num % 100 / 10;
        int numberThree = num % 100 % 10;
        if (numberOne == numberTwo && numberTwo == numberThree) {
            count = 3;
        } else if (numberOne == numberTwo) {
            count = 2;
        } else if (numberTwo == numberThree) {
            count = 2;
        } else if (numberOne == numberThree) {
            count = 2;
        }
        System.out.println(count);
    }
}
