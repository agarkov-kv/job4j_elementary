package ru.job4j.javacore.loops115;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 0; i < coords.length; i += 2) {
            int a = coords[i];
            int b = coords[i + 1];
            if ((Math.pow(x - a, 2) + Math.pow(y - b, 2)) == Math.pow(r, 2)) {
                on++;
            }
            if ((Math.pow(x - a, 2) + Math.pow(y - b, 2)) < Math.pow(r, 2)) {
                in++;
            }
        }
        System.out.println("На окружности: " + on + ", внутри: " + in);
    }
}


