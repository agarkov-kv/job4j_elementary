package ru.job4j.javacore.loops115;

public class Task5 {
    public static void out(int price) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i * price);
        }
    }
}
//Дано целое число price — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 5 кг конфет.