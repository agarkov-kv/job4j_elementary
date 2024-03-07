package ru.job4j.javacore.onedimensionalarray1162;

import java.util.StringJoiner;

public class Task3 {
    public static void array(int[] nums) {
        StringJoiner numb = new StringJoiner(" ");
        for (int num : nums) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                numb.add(String.valueOf(num));
            }
        }
        System.out.println(numb);
    }
}
