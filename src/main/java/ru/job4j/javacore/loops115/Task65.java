package ru.job4j.javacore.loops115;

public class Task65 {
    public static void loop(int[] nums) {
        int countMinus = 0;
        int countPlus = 0;
        for (int num : nums) {
            if (num > 0) {
                countPlus++;
            }
            if (num < 0) {
                countMinus++;
            }
        }
        if (countMinus == countPlus) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
