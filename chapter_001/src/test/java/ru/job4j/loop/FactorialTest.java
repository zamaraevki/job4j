package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FactorialTest {

    @Test
    public void whenCalculateFive() {
        int rsl = Factorial.calc(5);
        int expected = 120;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateSix() {
        int rsl = Factorial.calc(6);
        int expected = 720;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateZero() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }

    @Test
    public void whenCalculateOne() {
        int rsl = Factorial.calc(1);
        int expected = 1;
        assertThat(rsl, Matchers.is(expected));
    }
}
