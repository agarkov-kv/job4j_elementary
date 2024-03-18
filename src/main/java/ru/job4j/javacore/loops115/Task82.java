package ru.job4j.javacore.loops115;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int count = 0;
        int countFree = 0;
        for (int i = 0; i < promo.length; i++) {
            count += promo[i];
            if (promo[i]  > 9) {
                countFree += promo[i] / 10;
            }
        }
        for (int i = 0; i < concert.length; i++) {
            count += concert[i];
        }
        System.out.println("Продано билетов: " + count + ", выдано бесплатно: " + countFree);
    }
}
