package ru.job4j.javacore.loops115;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int month : months) {
            if (month >= 3 && month <= 5) {
                spring++;
            }
            if (month >= 6 && month <= 8) {
                summer++;
            }
            if (month >= 9 && month <= 11) {
                fall++;
            }
            if (month == 12 || month == 1 || month == 2) {
                winter++;
            }
        }
        System.out.println("Зимой: " + winter + ", Весной: " + spring + ", Летом: " + summer + ", Осенью: " + fall);
    }
}
