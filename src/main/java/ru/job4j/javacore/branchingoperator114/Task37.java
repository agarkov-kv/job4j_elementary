package ru.job4j.javacore.branchingoperator114;

public class Task37 {
    public static void maxDigit(int number) {
        int num1 = number / 10;
        int num2 = number % 10;
        if (num1 > num2) {
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);
        } else {
            System.out.println("Равны");
        }
    }
}
