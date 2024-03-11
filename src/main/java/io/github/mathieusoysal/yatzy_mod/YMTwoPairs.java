package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMTwoPairs} class represents the "Two Pairs" scoring mod in the
 * Yatzy game.
 * In this category, players score by summing the values of the two highest
 * matching dice pairs.
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 */
class YMTwoPairs implements YatzyModInterface {

    /**
     * Calculates the score for the "Two Pairs" category.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is the sum of the two highest matching
     *         dice pairs, or zero if not possible.
     * @see YatzyModUtils#filterByFrequency(int, Dices)
     */
    @Override
    public int calculateScore(Dices dices) {
        if (numberOfDistinctPairs(dices) == 2)
            return YatzyModUtils.filterByFrequency(2, dices).distinct().sum() * 2;
        else
            return 0;
    }

    /**
     * Counts the number of distinct pairs in the given set of dice.
     *
     * @param dices The set of dice to count pairs from.
     * @return The number of distinct pairs found in the dice set.
     * @see YatzyModUtils#filterByFrequency(int, Dices)
     */
    private int numberOfDistinctPairs(Dices dices) {
        return (int) YatzyModUtils.filterByFrequency(2, dices).distinct().count();
    }
}
