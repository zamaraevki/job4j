package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {


    @Test
    public void distance () {
        double inx1 = 1;
        double iny1 = 1;
        double inx2 = 3;
        double iny2 = 5;
        double expected = 4.47;
        double out = Point.distance (inx1, iny1, inx2, iny2);
        Assert.assertEquals (expected, out, 0.01);
    }

}

