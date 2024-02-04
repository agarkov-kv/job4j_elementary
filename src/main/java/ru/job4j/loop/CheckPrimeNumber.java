package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean canSmple = true;
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                canSmple = false;
                break;
            }
        }
        return canSmple;
    }
}