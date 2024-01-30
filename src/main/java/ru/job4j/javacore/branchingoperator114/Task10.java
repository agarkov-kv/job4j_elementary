package ru.job4j.javacore.branchingoperator114;

public class Task10 {
    public static int checkGame(double percent, int prize, int pay) {
        double sumprize = percent * prize;
        if (sumprize >= pay) {
            double profit = sumprize - pay;
            return (int) profit;
        }
        return 0;
    }
}
