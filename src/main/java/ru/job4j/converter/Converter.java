package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float inputDollar = 180;
        float expectedEuro = 2;
        float expectedDollar = 3;
        float euro = Converter.rubleToEuro(inputEuro);
        float dollar = Converter.rubleToDollar(inputDollar);
        boolean euroPassed = euro == expectedEuro;
        boolean dollarPassed = dollar == expectedDollar;
        System.out.println("140 rubles are 2 euro. Test result : " + euroPassed);
        System.out.println("180 rubles are 3 dollars. Test result : " + dollarPassed);
    }
}
