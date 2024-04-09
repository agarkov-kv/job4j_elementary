package ru.job4j.javacore.onedimensionalarray1162;

import java.util.StringJoiner;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {5, 5, 4, 3, 3, 1, 5, 4, 2};
        StringJoiner number = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > 1) {
                number.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(number);
    }
}
