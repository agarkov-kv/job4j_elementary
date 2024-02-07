package ru.job4j.javacore.branchingoperator114;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds <= 3600) {
            int minutes = seconds / 60;
            int secondsRemainder = seconds % 60;
            System.out.println("Минут: " + minutes + ", секунд: " + secondsRemainder);
        } else {
            System.out.println("Расчет не производится");
        }
    }
}