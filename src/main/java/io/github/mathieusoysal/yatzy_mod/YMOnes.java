package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMOnes} class represents the "Ones" category in the Yatzy game.
 * 
 * <p>
 * In the "Ones" category, the player scores the sum of the dice that show
 * the number one.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMOnes implements YatzyModInterface {

    /**
     * Calculates the score for the "Ones" category based on the sum of dice
     * values that show the number one.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of dice values that show the
     *         number one.
     * @see YatzyModUtils#filterAndSum(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        return YatzyModUtils.filterAndSum(1, dices);
    }
}
