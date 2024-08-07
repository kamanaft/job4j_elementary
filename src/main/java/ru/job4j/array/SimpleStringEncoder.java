package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                result += symbol + (counter > 1 ? Integer.toString(counter) : "");
                if ((i + 1) < input.length()) {
                    symbol = input.charAt(i + 1);
                    counter = 1;
                } else {
                    break;
                }
            }
        }
        return result;
    }
}