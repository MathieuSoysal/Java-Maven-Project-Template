package io.github.mathieusoysal;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import io.github.mathieusoysal.exception.IncorrectDiceValueException;

class DicesTest {

    @ParameterizedTest
    @CsvSource(value = {
            "0 2 3 4 5",
            "1 0 1 4 5",
            "6 2 0 4 5",
            "1 2 1 0 1",
            "3 3 3 4 0"
    }, delimiter = ' ')
    void test_throwsIncorrectDiceValue_with0(int d1, int d2, int d3, int d4, int d5) {
        assertThrows(IncorrectDiceValueException.class, () -> new Dices(d1, d2, d3, d4, d5),
                "Incorrect dice value. Dice value must be between 1 and 6.");
    }

    @ParameterizedTest
    @CsvSource(value = {
            "7 2 3 4 5",
            "1 7 1 4 5",
            "6 2 7 4 5",
            "1 2 1 7 1",
            "3 3 3 4 7"
    }, delimiter = ' ')
    void test_throwsIncorrectDiceValue_with7(int d1, int d2, int d3, int d4, int d5) {
        assertThrows(IncorrectDiceValueException.class, () -> new Dices(d1, d2, d3, d4, d5),
                "Incorrect dice value. Dice value must be between 1 and 6.");
    }
}
