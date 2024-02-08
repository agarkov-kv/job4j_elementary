package ru.job4j.javacore.branchingoperator114;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        int numberOne = num4 / 100;
        int numberTwo = num4 % 1000 / 10;
        int numberThree = num4 % 1000 % 100;
        if (numberOne == num2 || numberTwo == num2 || numberThree == num2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
