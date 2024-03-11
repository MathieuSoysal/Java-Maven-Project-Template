package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMTwos} class represents the "Twos" category scoring mod in the
 * Yatzy game.
 * In this category, players score by summing the values of the dice that show a
 * two.
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 */
class YMTwos implements YatzyModInterface {

    /**
     * Calculates the score for the "Twos" category.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that show a
     *         two.
     *
     * @see YatzyModUtils#filterAndSum(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(2, dices);
    }
}
