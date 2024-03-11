package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YatzyModInterface} defines a method for calculating scores based
 * on Yatzy game categories.
 * 
 * <p>
 * Implementing classes should provide specific scoring logic for each
 * category.
 * </p>
 * 
 * @author MathieuSoysal
 * @see Dices
 */
@FunctionalInterface
interface YatzyModInterface {

    /**
     * Calculates the score for a given set of dice based on the rules of a specific
     * Yatzy category.
     *
     * @param dices The set of dice to calculate the score for.
     * @return The calculated score based on the specific category's rules.
     */
    int calculateScore(Dices dices);
}
