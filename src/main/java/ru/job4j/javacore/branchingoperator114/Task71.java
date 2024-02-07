package ru.job4j.javacore.branchingoperator114;

public class Task71 {
    public static void change(int money) {
        if (money % 10 != 0) {
            System.out.println("Нельзя");
        } else {
            int x = money / 100;
            int y = money % 100 / 50;
            int z = money % 100 % 50 / 10;
            System.out.println("100: " + x + ", 50: "  + y + ", 10: " + z);
        }

    }
}
