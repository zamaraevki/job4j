package ru.job4j.condition;

public class Point {
    public static double distance(double x1, double y1, double x2, double y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 3, 5);
        double result1 = Point.distance(2, 6, 9, 1);
        System.out.println("result (1, 1) to (3, 5) " + result);
        System.out.println("result (2, 6) to (9, 1) " + result1);
    }
}