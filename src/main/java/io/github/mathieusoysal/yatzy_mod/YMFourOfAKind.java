package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMFourOfAKind} class represents the "Four of a Kind" category in
 * the Yatzy game.
 * 
 * <p>
 * In the "Four of a Kind" category, the player scores the sum of four dice with
 * the same number.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMFourOfAKind implements YatzyModInterface {

    /**
     * Calculates the score for the "Four of a Kind" category based on the sum of
     * four dice with the same number.
     * If there are no four dice with the same number, the score is zero.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of four dice with the same
     *         number or zero if not possible.
     * @see YatzyModUtils#filterByFrequency(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(4, dices)
                .findAny()
                .orElse(0) * 4;
    }
}
