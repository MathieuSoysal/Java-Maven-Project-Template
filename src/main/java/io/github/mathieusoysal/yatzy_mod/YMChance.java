package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMChance} class represents the "Chance" category in the Yatzy
 * game.
 * 
 * <p>
 * In the "Chance" category, the player scores the sum of all dice, regardless
 * of their values.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 */
class YMChance implements YatzyModInterface {

    /**
     * Calculates the score for the "Chance" category based on the sum of all dice
     * values.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of all dice values.
     * @see Dices#getDicesIntStream()
     */
    @Override
    public int calculateScore(Dices dices) {
        return dices.getDicesIntStream().sum();
    }
}
