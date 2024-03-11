package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMFullHouse} class represents the "Full House" category in the
 * Yatzy game.
 * 
 * <p>
 * In the "Full House" category, the player scores the sum of all dice if there
 * are two dice of one kind and three dice of another kind. Otherwise, the score
 * is zero.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMFullHouse implements YatzyModInterface {

    /**
     * Calculates the score for the "Full House" category based on the sum of all
     * dice if the criteria are met.
     * To qualify as a Full House, there must be two dice of one kind and three dice
     * of another kind.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of all dice if it's a Full
     *         House, or zero if not.
     * @see YatzyModUtils#containsExactFrequencyDice(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        if (containsTriplet(dices) && containsPair(dices))
            return dices.getDicesIntStream().sum();
        else
            return 0;
    }

    /**
     * Checks if the given set of dice contains a pair of dice with the same value.
     *
     * @param dices The set of dice to check.
     * @return True if a pair is present; otherwise, false.
     * @see YatzyModUtils#containsExactFrequencyDice(int, Dices)
     */
    private boolean containsPair(Dices dices) {
        return YatzyModUtils.containsExactFrequencyDice(2, dices);
    }

    /**
     * Checks if the given set of dice contains three dice with the same value.
     *
     * @param dices The set of dice to check.
     * @return True if a triplet is present; otherwise, false.
     * @see YatzyModUtils#containsExactFrequencyDice(int, Dices)
     */
    private boolean containsTriplet(Dices dices) {
        return YatzyModUtils.containsExactFrequencyDice(3, dices);
    }
}
