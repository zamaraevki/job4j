package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }
        public static int max(int first, int second, int third, int fourth) {
            int result = fourth;
            if (max(first, second, third) > fourth) {
                result = max(first, second, third);
            }
            return result;
    }
}
