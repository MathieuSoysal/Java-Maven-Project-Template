package io.github.mathieusoysal.yatzy_mod;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import io.github.mathieusoysal.Dices;
import io.github.mathieusoysal.exception.NullDicesException;

class YatzyModTest {

    @ParameterizedTest
    @EnumSource(YatzyMod.class)
    void test_calculateScore_withNullDices(YatzyMod yatzyMod) {
        assertThrows(NullDicesException.class, () -> yatzyMod.calculateScore(null), "Dices cannot be null.");
    }

    @ParameterizedTest
    @EnumSource(YatzyMod.class)
    void test_calculateScore_withNotNullDices(YatzyMod yatzyMod) {
        assertDoesNotThrow(() -> yatzyMod.calculateScore(new Dices(1, 1, 1, 1, 1)));
    }
}
