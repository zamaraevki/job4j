package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenOnetoTen() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenTreetoOnehundred() {
        int rsl = Counter.sumByEven(3, 100);
        int expected = 2548;
        assertThat(rsl, is(expected));
    }
}