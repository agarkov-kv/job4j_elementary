package ru.job4j.javacore.branchingoperator114;

public class Task79 {
    public static void getCentury(int num) {
        if (num > 1500 && num < 1601) {
            System.out.println("16");
        } else if (num > 1600 && num < 1701) {
            System.out.println("17");
        } else if (num > 1700 && num < 1801) {
            System.out.println("18");
        } else if (num > 1800 && num < 1901) {
            System.out.println("19");
        } else if (num > 1900 && num < 2001) {
            System.out.println("20");
        } else {
            System.out.println("Не попадает в диапазон");
        }
    }
}
