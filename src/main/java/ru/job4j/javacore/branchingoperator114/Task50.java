package ru.job4j.javacore.branchingoperator114;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int number1 = num1 % 10;
        int number2 = num2 % 10;
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number1 < number2) {
            System.out.println(number2);
        } else {
            System.out.println("Одинаковые");
        }
    }
}
