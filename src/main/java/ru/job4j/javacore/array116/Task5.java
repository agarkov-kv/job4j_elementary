package ru.job4j.javacore.array116;

import java.util.ArrayList;

public class Task5 {
    public static int[] changeData(int[] data) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                arrayList.add(data[i]);
            }
        }
        int[] newArray = new int[arrayList.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = arrayList.get(i);
        }
        return newArray;
    }
}

