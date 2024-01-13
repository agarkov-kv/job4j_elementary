package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(700);
        float dollar = Converter.rubleToDollar(1200);
        System.out.println("700 rubles are " + euro + " euro.");
        System.out.println("1200 rubles are " + dollar + " dollars.");
        float expectedEuro = 10;
        float expectedDollar = 20;
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("700 rubles are 10. Test result : " + passedEuro);
        System.out.println("1200 rubles are 20. Test result : " + passedDollar);
    }
}