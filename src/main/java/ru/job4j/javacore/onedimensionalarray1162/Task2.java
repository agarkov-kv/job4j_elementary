package ru.job4j.javacore.onedimensionalarray1162;

import java.util.StringJoiner;

public class Task2 {
    public static void array(int[] arr) {
        StringJoiner numb  = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            numb.add(String.valueOf(arr[i]));
        }
        System.out.println(numb);
    }
}
