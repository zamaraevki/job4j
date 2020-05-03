package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second) {
        int result = first;
        if (second > first) {
            result = second;
        }
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
            return max(max(first, second, third), fourth);
    }
}
