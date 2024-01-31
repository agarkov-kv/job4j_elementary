package ru.job4j.javacore.branchingoperator114;

public class Task14 {
    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            }
            if (year % 100 == 0 && year % 400 == 0) {
                return true;
            }
        }
        return false;
    }
}
