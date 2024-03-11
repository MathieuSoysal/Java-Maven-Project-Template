package io.github.mathieusoysal;

import io.github.mathieusoysal.yatzy_mod.YatzyMod;

/**
 * The {@code Yatzy} class provides static methods for calculating scores for
 * the Yatzy game.
 * 
 * 
 * @author MathieuSoysal
 */
public class Yatzy {

    private Yatzy() {
    }

    /**
     * Calculate the score for the given category {@code YatzyMod} based on the
     * given set of dice {@code Dices}.
     * 
     * @param mod   The category to calculate the score for.
     * @param dices The set of dice.
     * @return The calculated score for the given category.
     * @see YatzyMod#calculateScore(Dices)
     */
    public static int calculateScore(YatzyMod mod, Dices dices) {
        return mod.calculateScore(dices);
    }

    /**
     * Calculate the score for the "Chance" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Chance" category.
     * @see YatzyMod#CHANCE
     */
    public static int chance(Dices dices) {
        return calculateScore(YatzyMod.CHANCE, dices);
    }

    /**
     * Calculate the score for the "Yatzy" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Yatzy" category.
     * @see YatzyMod#YATZY
     */
    public static int yatzy(Dices dices) {
        return calculateScore(YatzyMod.YATZY, dices);
    }

    /**
     * Calculate the score for the "Ones" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Ones" category.
     * @see YatzyMod#ONES
     */
    public static int ones(Dices dices) {
        return calculateScore(YatzyMod.ONES, dices);
    }

    /**
     * Calculate the score for the "Twos" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Twos" category.
     * @see YatzyMod#TWOS
     */
    public static int twos(Dices dices) {
        return calculateScore(YatzyMod.TWOS, dices);
    }

    /**
     * Calculate the score for the "Threes" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Threes" category.
     * @see YatzyMod#THREES
     */
    public static int threes(Dices dices) {
        return calculateScore(YatzyMod.THREES, dices);
    }

    /**
     * Calculate the score for the "Fours" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Fours" category.
     * @see YatzyMod#FOURS
     */
    public static int fours(Dices dices) {
        return calculateScore(YatzyMod.FOURS, dices);
    }

    /**
     * Calculate the score for the "Fives" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Fives" category.
     */
    public static int fives(Dices dices) {
        return calculateScore(YatzyMod.FIVES, dices);
    }

    /**
     * Calculate the score for the "Sixes" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Sixes" category.
     * @see YatzyMod#SIXES
     */
    public static int sixes(Dices dices) {
        return calculateScore(YatzyMod.SIXES, dices);
    }

    /**
     * Calculate the score for the "Pair" category based on the given set of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Pair" category.
     * @see YatzyMod#PAIR
     */
    public static int pair(Dices dices) {
        return calculateScore(YatzyMod.PAIR, dices);
    }

    /**
     * Calculate the score for the "Two Pairs" category based on the given set of
     * dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Two Pairs" category.
     */
    public static int twoPairs(Dices dices) {
        return calculateScore(YatzyMod.TWO_PAIRS, dices);
    }

    /**
     * Calculate the score for the "Four of a Kind" category based on the given set
     * of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Four of a Kind" category.
     */
    public static int fourOfAKind(Dices dices) {
        return calculateScore(YatzyMod.FOUR_OF_A_KIND, dices);
    }

    /**
     * Calculate the score for the "Three of a Kind" category based on the given set
     * of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Three of a Kind" category.
     * @see YatzyMod#THREE_OF_A_KIND
     */
    public static int threeOfAKind(Dices dices) {
        return calculateScore(YatzyMod.THREE_OF_A_KIND, dices);
    }

    /**
     * Calculate the score for the "Small Straight" category based on the given set
     * of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Small Straight" category.
     * @see YatzyMod#SMALL_STRAIGHT
     */
    public static int smallStraight(Dices dices) {
        return calculateScore(YatzyMod.SMALL_STRAIGHT, dices);
    }

    /**
     * Calculate the score for the "Large Straight" category based on the given set
     * of dice.
     * 
     * @param dices The set of dice.
     * @return The calculated score for the "Large Straight" category.
     * @see YatzyMod#LARGE_STRAIGHT
     */
    public static int largeStraight(Dices dices) {
        return calculateScore(YatzyMod.LARGE_STRAIGHT, dices);
    }

    /**
     * Calculate the score for the "Full House" category based on the given set of
     * dice.
     *
     * @param dices The set of dice.
     * @return The calculated score for the "Full House" category.
     * @see YatzyMod#FULL_HOUSE
     */
    public static int fullHouse(Dices dices) {
        return calculateScore(YatzyMod.FULL_HOUSE, dices);
    }
}
