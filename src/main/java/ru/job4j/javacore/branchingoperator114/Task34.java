package ru.job4j.javacore.branchingoperator114;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils == chairs) {
            System.out.println("Соответствует");
        } else if (pupils < chairs) {
            int def = chairs - pupils;
            System.out.println("Лишних стульев: " + def);
        } else {
            int def = pupils - chairs;
            System.out.println("Не хватает стульев: " + def);
        }
    }
}
