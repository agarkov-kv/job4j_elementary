package ru.job4j.javacore.branchingoperator114;

public class Task76 {
    public static void innerNum(int num2, int num4) {
        int count = 0;
        int numberOne = num4 / 100;
        int numberTwo = num4 % 1000 / 10;
        int numberThree = num4 % 100;
        if (num2 == numberOne) {
            count++;
        }
        if (num2 == numberTwo) {
            count++;
        }
        if (num2 == numberThree) {
            count++;
        } else if (num2 == numberTwo && num2 == numberThree && num2 == numberOne) {
            count = 3;
        }
        System.out.println(count);
    }
}
