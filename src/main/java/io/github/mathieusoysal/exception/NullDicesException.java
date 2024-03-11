package io.github.mathieusoysal.exception;

/**
 * An exception indicating that a null value was provided for the dices.
 * This exception is thrown when a null value is provided for the dices.
 */
public class NullDicesException extends IllegalArgumentException {

    /**
     * Constructs a NullDicesException with a default error message.
     * The default error message states that the dices cannot be null.
     */
    public NullDicesException() {
        super("Dices cannot be null.");
    }
}
