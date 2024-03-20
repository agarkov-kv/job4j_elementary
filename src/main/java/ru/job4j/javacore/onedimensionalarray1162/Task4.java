package ru.job4j.javacore.onedimensionalarray1162;

import java.util.Arrays;

public class Task4 {
    public static int[] array(int[] nums) {
        int[] result = new int[100];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
        if (count == 1) {
            result[size++] = i;
        }
        }
        return Arrays.copyOf(result, size);
    }
}
