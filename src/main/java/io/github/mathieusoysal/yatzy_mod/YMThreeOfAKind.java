package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMThreeOfAKind} class represents the "Three of a Kind" category in
 * the
 * Yatzy game.
 * 
 * <p>
 * In the "Three of a Kind" category, the player scores the sum of three dice
 * with
 * the same number.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMThreeOfAKind implements YatzyModInterface {

    /**
     * Calculates the score for the "Three of a Kind" category based on the sum of
     * three dice with the same number.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of three dice with the same
     *         number, or zero if not possible.
     * @see YatzyModUtils#filterByFrequency(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(3, dices)
                .findAny()
                .orElse(0) * 3;
    }
}
