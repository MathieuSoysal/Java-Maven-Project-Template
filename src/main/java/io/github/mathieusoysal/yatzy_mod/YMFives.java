package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMFives} class represents the "Fives" category in the Yatzy game.
 * 
 * <p>
 * In the "Fives" category, the player scores the sum of the dice that show
 * the number five.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMFives implements YatzyModInterface {

    /**
     * Calculates the score for the "Fives" category based on the sum of dice
     * values that show the number five.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that show the
     *         number five.
     * @see YatzyModUtils#filterAndSum(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(5, dices);
    }
}
