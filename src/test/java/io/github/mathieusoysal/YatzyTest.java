package io.github.mathieusoysal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class YatzyTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2 3 4 5 1 15",
            "3 3 4 5 1 16",
            "1 1 3 3 6 14",
            "4 5 5 6 1 21"
    }, delimiter = ' ')
    void test_chance(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.chance(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 4 4 50",
            "1 1 1 1 1 50",
            "6 6 6 6 6 50",
            "1 1 1 2 1 0",
            "6 6 6 6 3 0"
    }, delimiter = ' ')
    void test_yatzy(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.yatzy(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 4 5 1",
            "1 2 1 4 5 2",
            "6 2 2 4 5 0",
            "1 2 1 1 1 4",
            "3 3 3 4 5 0"
    }, delimiter = ' ')
    void test_ones(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.ones(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 2 6 4",
            "2 2 2 2 2 10",
            "2 3 2 5 1 4"
    }, delimiter = ' ')
    void test_twos(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.twos(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 2 3 6",
            "2 3 3 3 3 12"
    }, delimiter = ' ')
    void test_threes(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.threes(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 1 2 4 4 8",
            "4 4 4 5 5 12",
            "4 4 5 5 5 8",
            "4 5 5 5 5 4"
    }, delimiter = ' ')
    void test_fours(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.fours(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 5 5 10",
            "4 4 5 5 5 15",
            "4 5 5 5 5 20"
    }, delimiter = ' ')
    void test_fives(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.fives(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "4 4 4 5 5 0",
            "4 4 6 5 5 6",
            "6 5 6 6 5 18"
    }, delimiter = ' ')
    void test_sixes(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.sixes(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 4 5 0",
            "3 3 3 4 4 8",
            "1 1 6 2 6 12",
            "3 3 3 4 1 6",
            "3 3 3 3 1 6",
            "3 4 3 5 6 6",
            "5 3 3 3 5 10",
            "5 3 6 6 5 12"
    }, delimiter = ' ')
    void test_onePair(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.pair(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3 3 5 4 5 16",
            "3 3 5 5 5 16",
            "1 1 2 3 3 8",
            "1 1 2 3 4 0",
            "1 1 2 2 2 6",
            "3 3 3 3 1 0"
    }, delimiter = ' ')
    void test_twoPairs(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.twoPairs(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3 3 3 4 5 9",
            "5 3 5 4 5 15",
            "3 3 3 3 5 9",
            "3 3 4 5 6 0",
            "3 3 3 3 1 9"
    }, delimiter = ' ')
    void test_threeOfAKind(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.threeOfAKind(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "3 3 3 3 5 12",
            "5 5 5 4 5 20",
            "3 3 3 3 3 12",
            "2 2 2 2 5 8",
            "2 2 2 5 5 0",
            "2 2 2 2 2 8"
    }, delimiter = ' ')
    void test_fourOfAKind(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.fourOfAKind(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1 2 3 4 5 15",
            "2 3 4 5 1 15",
            "1 2 2 4 5 0"
    }, delimiter = ' ')
    void test_smallStraight(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.smallStraight(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6 2 3 4 5 20",
            "2 3 4 5 6 20",
            "1 2 2 4 5 0"
    }, delimiter = ' ')
    void test_largeStraight(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.largeStraight(new Dices(d1, d2, d3, d4, d5)));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "6 2 2 2 6 18",
            "2 3 4 5 6 0",
            "1 1 2 2 2 8",
            "2 2 3 3 4 0",
            "4 4 4 4 4 0",
            "4 4 4 1 3 0"
    }, delimiter = ' ')
    void test_fullHouse(int d1, int d2, int d3, int d4, int d5, int expected) {
        assertEquals(expected, Yatzy.fullHouse(new Dices(d1, d2, d3, d4, d5)));
    }
}
