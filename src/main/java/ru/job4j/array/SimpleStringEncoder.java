package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                result += input.charAt(i) + String.valueOf(counter);
                counter = 1;
            }
        }
        // Добавление последнего символа и его количества после цикла
        result += input.charAt(input.length() - 1) + String.valueOf(counter);
        return result;
    }
}