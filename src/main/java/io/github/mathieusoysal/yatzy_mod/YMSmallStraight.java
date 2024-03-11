package io.github.mathieusoysal.yatzy_mod;

import static io.github.mathieusoysal.yatzy_mod.YatzyModUtils.isItEqualsWhenDicesIsSorted;

import java.util.List;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMSmallStraight} class represents the "Small Straight" category in
 * the
 * Yatzy game.
 * 
 * <p>
 * In the "Small Straight" category, the player scores 15 if the dice show
 * the values [1, 2, 3, 4, 5] in ascending order. Otherwise, the score is zero.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMSmallStraight implements YatzyModInterface {
    private static final List<Integer> SMALL_STRAIGHT_LIST = List.of(1, 2, 3, 4, 5);

    /**
     * Calculates the score for the "Small Straight" category based on the dice
     * values.
     * The player scores 15 if the dice show the values [1, 2, 3, 4, 5] in
     * ascending order.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is 15 for a Small Straight, or zero if
     *         not.
     * @see YatzyModUtils#isItEqualsWhenDicesIsSorted(Dices, List)
     */
    @Override
    public int calculateScore(Dices dices) {
        return isItEqualsWhenDicesIsSorted(dices, SMALL_STRAIGHT_LIST) ? 15 : 0;
    }
}
