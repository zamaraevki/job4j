package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int x = first >= second ? first : second;
        int result = x >= third ? x : third;
        return result;
    }
}
