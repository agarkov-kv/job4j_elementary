package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    void whenStart0Finish0Then0() {
        int start = 0;
        int finish = 0;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart14Finish15Then14() {
        int start = 14;
        int finish = 15;
        int expected = 29;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }

    @Test
    void whenStart16Finish15Then0() {
        int start = 16;
        int finish = 15;
        int expected = 0;
        int sum = Counter.sum(start, finish);
        assertThat(sum).isEqualTo(expected);
    }
}