package io.github.mathieusoysal.yatzy_mod;

import io.github.mathieusoysal.Dices;
import io.github.mathieusoysal.exception.NullDicesException;

/**
 * The {@code YatzyMod} enum represents different scoring categories in the
 * Yatzy game. Each category has a specific scoring rule associated with it.
 *
 * @author MathieuSoysal
 * @see Dices
 * @see YatzyModInterface
 */
public enum YatzyMod {
    /**
     * CHANCE
     * Is the sum of all dice, no matter what they read.
     * 
     * @see YMChance
     */
    CHANCE(new YMChance()),

    /**
     * YATZY
     * If all dice have the same number,
     * the player scores 50 points.
     * 
     * @see YMYatzy
     */
    YATZY(new YMYatzy()),

    /**
     * ONES
     * The player scores the sum of the dice that reads one respectively.
     * 
     * @see YMOnes
     */
    ONES(new YMOnes()),

    /**
     * TWOS
     * The player scores the sum of the dice that reads two respectively.
     * 
     * @see YMTwos
     */
    TWOS(new YMTwos()),

    /**
     * THREES
     * The player scores the sum of the dice that reads three respectively.
     * 
     * @see YMThrees
     */
    THREES(new YMThrees()),

    /**
     * FOURS
     * The player scores the sum of the dice that reads four respectively.
     * 
     * @see YMFours
     */
    FOURS(new YMFours()),

    /**
     * FIVES
     * The player scores the sum of the dice that reads five respectively.
     * 
     * @see YMFives
     */
    FIVES(new YMFives()),

    /**
     * SIXES
     * The player scores the sum of the dice that reads six respectively.
     * 
     * @see YMSixes
     */
    SIXES(new YMSixes()),

    /**
     * PAIR
     * The player scores the sum of the two highest matching dice.
     * 
     * @see YMPair
     */
    PAIR(new YMPair()),

    /**
     * TWO_PAIRS
     * The player scores the sum of the two pairs of dice with the same number.
     * 
     * @see YMTwoPairs
     */
    TWO_PAIRS(new YMTwoPairs()),

    /**
     * THREE_OF_A_KIND
     * The player scores the sum of three dice with the same number.
     * 
     * @see YMThreeOfAKind
     */
    THREE_OF_A_KIND(new YMThreeOfAKind()),

    /**
     * FOUR_OF_A_KIND
     * The player scores the sum of four dice with the same number.
     * 
     * @see YMFourOfAKind
     */
    FOUR_OF_A_KIND(new YMFourOfAKind()),

    /**
     * SMALL_STRAIGHT
     * The player scores 15 if the dice form a small straight (1, 2, 3, 4, 5).
     * 
     * @see YMSmallStraight
     */
    SMALL_STRAIGHT(new YMSmallStraight()),

    /**
     * LARGE_STRAIGHT
     * The player scores 20 if the dice form a large straight (2, 3, 4, 5, 6).
     * 
     * @see YMLargeStraight
     */
    LARGE_STRAIGHT(new YMLargeStraight()),

    /**
     * FULL_HOUSE
     * The player scores the sum of all dice if they form a full house (two of a
     * kind and three of a kind).
     * 
     * @see YMFullHouse
     */
    FULL_HOUSE(new YMFullHouse());

    private YatzyModInterface mod;

    /**
     * Constructor for YatzyMod enum.
     *
     * @param mod The YatzyModInterface implementation for the category.
     */
    YatzyMod(YatzyModInterface mod) {
        this.mod = mod;
    }

    /**
     * Calculate the score for a given set of dice based on the category represented
     * by this enum value.
     *
     * @param dices The set of dice.
     * @return The calculated score for the category.
     * @throws NullDicesException If the given set of dice is null.
     * @see NullDicesException
     */
    public int calculateScore(Dices dices) {
        if (dices == null)
            throw new NullDicesException();
        return mod.calculateScore(dices);
    }
}
