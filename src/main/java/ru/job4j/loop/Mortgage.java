package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (((percent) / 100) * amount) + amount - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(100, 70, 50));
    }

}
