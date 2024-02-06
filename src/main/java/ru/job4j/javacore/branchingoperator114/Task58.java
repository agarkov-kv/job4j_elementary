package ru.job4j.javacore.branchingoperator114;

public class Task58 {
    public static void isWinning(int number) {
        int numberFirst = number / 1000;
        int numberSecond = number % 1000;
        if (numberFirst / 100 + numberFirst % 100 / 10 + numberFirst % 100 % 10 == numberSecond / 100 + numberSecond % 100 / 10 + numberSecond % 100 % 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
