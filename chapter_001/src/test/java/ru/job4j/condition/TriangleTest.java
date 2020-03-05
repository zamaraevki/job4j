package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
        public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 1.0);
        assertThat(result, is(true));
    }

    @Test
        public void whenExist2() {
        boolean result = Triangle.exist(100.0, 2.0, 1.0);
        assertThat(result, is(true));
    }

}