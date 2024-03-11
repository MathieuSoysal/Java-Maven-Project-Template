package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMPair} class represents the "Pair" category in the Yatzy game.
 * 
 * <p>
 * In the "Pair" category, the player scores the sum of the two highest
 * matching dice values.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMPair implements YatzyModInterface {

    /**
     * Calculates the score for the "Pair" category based on the sum of the two
     * highest matching dice values.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of the two highest matching
     *         dice values, or zero if not possible.
     * @see YatzyModUtils#filterByFrequency(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterByFrequency(2, dices)
                .max()
                .orElse(0) * 2;
    }
}
