package ru.job4j.javacore.branchingoperator114;

public class Task77 {
    public static void diffNumAmount(int num) {
        int count = 0;
        int numberOne = num / 100;
        int numberTwo = num % 100 / 10;
        int numberThree = num % 100 % 10;
        if (numberOne != numberTwo && numberOne != numberThree && numberTwo != numberThree) {
            count = 3;
            System.out.println(count);
        } else if (numberOne != numberTwo || numberOne != numberThree || numberTwo != numberThree) {
            count = 2;
            System.out.println(count);
        } else {
            System.out.println(count);
        }
    }
}
