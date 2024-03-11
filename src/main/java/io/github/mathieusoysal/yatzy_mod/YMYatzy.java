package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YMYatzy} class represents the "Yatzy" category scoring mod in the
 * Yatzy game.
 * <p>
 * In this category, players score 50 points if all dice have the same number.
 * </p>
 *
 * @author MathieuSoysal
 * @see YatzyModInterface
 */
class YMYatzy implements YatzyModInterface {

    /**
     * Calculates the score for the "Yatzy" category.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score, which is 50 if all dice have the same number,
     *         or zero if not.
     *
     * @see Dices#getDicesIntStream()
     */
    @Override
    public int calculateScore(Dices dices) {
        return dices.getDicesIntStream().distinct().count() == 1 ? 50 : 0;
    }
}
