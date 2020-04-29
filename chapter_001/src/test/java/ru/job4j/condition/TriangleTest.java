
package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 1);
        Point third = new Point(1, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 0.5;
        System.out.println("Result is " + result);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenAreaSetThreePointsThenTriangleArea1() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        double expected = 2;
        System.out.println("Result is " + result);
        Assert.assertEquals(expected, result, 0.01);
    }
}