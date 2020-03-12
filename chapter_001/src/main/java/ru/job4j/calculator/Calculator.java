package ru.job4j.calculator;

/**
 * Сложение 2-х чисел
 * @author Konstantin Zamaraev (zamaraevki@gmail.com)
 */
public class Calculator {
    /**
     * Method plus.
     * @param first первое число.
     * @param second второе число.
     * @return first plus second.
     */
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    /**
     * Main.
     * @param args - args.
     */
    public static void main(String[] args) {
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}
