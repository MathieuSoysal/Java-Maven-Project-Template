package io.github.mathieusoysal;

import java.util.stream.IntStream;

import io.github.mathieusoysal.exception.IncorrectDiceValueException;

/**
 * The {@code Dices} class represents a set of five dice used in the Yatzy game.
 * It allows you to store and manipulate the values of these dice.
 *
 * @see IntStream
 * @see IncorrectDiceValueException
 */
public class Dices {
    private int[] dicesArray;

    /**
     * Constructs a new {@code Dices} object with the values of five dice.
     * 
     * @param dice1 The value of the first die.
     * @param dice2 The value of the second die.
     * @param dice3 The value of the third die.
     * @param dice4 The value of the fourth die.
     * @param dice5 The value of the fifth die.
     * @throws IncorrectDiceValueException If any of the dice values are not in the
     *                                     valid range [1, 6].
     */
    public Dices(int dice1, int dice2, int dice3, int dice4, int dice5) {
        dicesArray = new int[] { dice1, dice2, dice3, dice4, dice5 };
        for (int diceValue : dicesArray)
            checkDiceValue(diceValue);
    }

    /**
     * Checks if a given dice value is within the valid range [1, 6].
     * 
     * @param diceValue The value of the dice to check.
     * @throws IncorrectDiceValueException If the dice value is not in the valid
     *                                     range [1, 6].
     */
    private void checkDiceValue(int diceValue) {
        if (diceValue < 1 || diceValue > 6)
            throw new IncorrectDiceValueException();
    }

    /**
     * Returns an {@link IntStream} of the dice values.
     * 
     * @return An {@link IntStream} containing the values of the five dice.
     */
    public IntStream getDicesIntStream() {
        return IntStream.of(dicesArray);
    }
}
