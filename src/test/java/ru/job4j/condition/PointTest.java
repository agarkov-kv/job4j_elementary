package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when36to68then1Dot89() {
        double expected = 1.89;
        int x1 = 3;
        int y1 = 6;
        int x2 = 6;
        int y2 = 8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when0Minus2toMinus20then1Dot68() {
        double expected = 1.68;
        int x1 = 0;
        int y1 = -2;
        int x2 = -2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus22to34Minus2then6Dot01() {
        double expected = 6.01;
        int x1 = -2;
        int y1 = 2;
        int x2 = 34;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to20then2() {
        double expected = 0.0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}