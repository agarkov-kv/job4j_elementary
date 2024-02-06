package ru.job4j.javacore.branchingoperator114;

public class Task67 {
    public static void daytime(int number) {
        if (number >= 23 || number == 0 || number > 1 && number < 6) {
            System.out.println("Ночь");
        } else if (number > 5 && number < 11) {
            System.out.println("Утро");
        } else if (number > 10 && number < 18) {
            System.out.println("День");
        } else if (number > 17 && number < 23) {
            System.out.println("Вечер");
        } else {
            System.out.println("Не является часом");
        }
    }
}
