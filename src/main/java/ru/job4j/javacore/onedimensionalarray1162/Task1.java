package ru.job4j.javacore.onedimensionalarray1162;

import java.util.StringJoiner;

public class Task1 {
    public static void array(int[] arr) {
        StringJoiner numb = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            numb.add(String.valueOf(arr[i]));
        }
        System.out.println(numb);
    }
}
