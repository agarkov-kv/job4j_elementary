package ru.job4j.javacore.branchingoperator114;

public class Task54 {
    public static void transformFraction(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 / num2);
        } else if (num1 / num2 >= 1) {
            int whole = num1 / num2;
            num1 = num1 % num2;
            System.out.println(whole + " " + num1 + "/" + num2);
        } else if (num1 == num2) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Подсчет не производится");
        }
    }
}
