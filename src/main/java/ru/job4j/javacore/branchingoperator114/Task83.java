package ru.job4j.javacore.branchingoperator114;

public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
        if (name1 == name2 && surname1 == surname2) {
            System.out.println("Тезки и однофамильцы");
        } else if (name1 == name2 || surname1 == surname2) {
            if (name1 == name2) {
                System.out.println("Тезки");
            } else {
                System.out.println("Однофамильцы");
            }
        } else {
            System.out.println("Совпадений нет");
        }
    }
}
