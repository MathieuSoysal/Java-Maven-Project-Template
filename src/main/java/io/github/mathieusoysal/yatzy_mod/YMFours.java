package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMFours} class represents the "Fours" category in the Yatzy game.
 * 
 * <p>
 * In the "Fours" category, the player scores the sum of the dice that show
 * the number four.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMFours implements YatzyModInterface {

    /**
     * Calculates the score for the "Fours" category based on the sum of dice
     * values that show the number four.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that show the
     *         number four.
     * @see YatzyModUtils#filterAndSum(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(4, dices);
    }
}
