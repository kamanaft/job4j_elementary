package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 98;
    }

    public static float rubleToDollar(float value) {
        return value / 91;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(1000);
        float dollar = Converter.rubleToDollar((1000));
        System.out.println("1000 rubles are " + euro + " euros");
        System.out.println("1000 rubles are " + dollar + " dollars");
    }
}
