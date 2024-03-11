package io.github.mathieusoysal.yatzy_mod;

import static io.github.mathieusoysal.yatzy_mod.YatzyModUtils.isItEqualsWhenDicesIsSorted;

import java.util.List;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMLargeStraight} class represents the "Large Straight" category in
 * the Yatzy game.
 * 
 * <p>
 * In the "Large Straight" category, the player scores 20 if the dice show the
 * values [2, 3, 4, 5, 6] in ascending order. Otherwise, the score is zero.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 * @see YatzyModUtils
 */
class YMLargeStraight implements YatzyModInterface {
    private static final List<Integer> LARGE_STRAIGHT_LIST = List.of(2, 3, 4, 5, 6);

    /**
     * Calculates the score for the "Large Straight" category based on the dice
     * values.
     * The player scores 20 if the dice show the values [2, 3, 4, 5, 6] in
     * ascending order.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is 20 for a Large Straight, or zero if
     *         not.
     */
    @Override
    public int calculateScore(Dices dices) {
        return isItEqualsWhenDicesIsSorted(dices, LARGE_STRAIGHT_LIST) ? 20 : 0;
    }
}
