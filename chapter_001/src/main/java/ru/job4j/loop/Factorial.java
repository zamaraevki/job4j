package ru.job4j.loop;

public class Factorial {

    public static int calc(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}