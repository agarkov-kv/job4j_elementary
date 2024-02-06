package ru.job4j.javacore.branchingoperator114;

public class Task62 {
    public static void isRising(int number) {
        int numberOne = number / 100;
        int numberTwo = number % 100 / 10;
        int numberThree = number % 100 % 10;
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
