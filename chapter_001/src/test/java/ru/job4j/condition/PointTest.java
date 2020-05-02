package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;


public class PointTest {
    @Test
    public void whendifferenceOne() {
        Point a = new Point(0, 0, 1);
        Point b = new Point(0, 0, 2);
        double result = a.distance3d(b);
        double expected = 1;
        System.out.println("Result is " + result);
        Assert.assertEquals(expected, result, 0.01);
    }

}