package ru.job4j.javacore.branchingoperator114;

public class Task72 {
    public static void midDigitMore(int num) {
        int numberOne = num / 100;
        int numberTwo = num % 100 / 10;
        int numberThree = num % 100 % 10;
        if (numberOne < numberTwo && numberThree < numberTwo) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
