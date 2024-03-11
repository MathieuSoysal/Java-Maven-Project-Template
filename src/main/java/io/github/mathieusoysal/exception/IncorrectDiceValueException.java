package io.github.mathieusoysal.exception;

/**
 * An exception indicating that an incorrect dice value was provided.
 * This exception is thrown when a dice value is outside the valid range [1, 6].
 */
public class IncorrectDiceValueException extends IllegalArgumentException {

    /**
     * Constructs an IncorrectDiceValueException with a default error message.
     * The default error message states that the dice value must be between 1 and 6.
     */
    public IncorrectDiceValueException() {
        super("Incorrect dice value. Dice value must be between 1 and 6.");
    }

}
