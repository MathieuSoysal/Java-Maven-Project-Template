package io.github.mathieusoysal.yatzy_mod;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import io.github.mathieusoysal.Dices;

/**
 * The {@code YatzyModUtils} class provides utility methods for Yatzy game score
 * calculations.
 * 
 * @author MathieuSoysal
 * @see Dices
 */
class YatzyModUtils {

        private YatzyModUtils() {
        }

        /**
         * Filters and sums the dice values that match a given number.
         *
         * @param diceNumber  The number to match.
         * @param diceResults The set of dice to filter and sum.
         * @return The sum of dice values that match the given number.
         */
        static int filterAndSum(int diceNumber, Dices diceResults) {
                return diceResults.getDicesIntStream()
                                .filter(d -> d == diceNumber)
                                .sum();
        }

        /**
         * Checks if the dice values match a specified list when sorted.
         *
         * @param dices      The set of dice to check.
         * @param toBeEquals The list of values to compare with the sorted dice values.
         * @return {@code true} if the dice values match the specified list when sorted,
         *         {@code false} otherwise.
         */
        static boolean isItEqualsWhenDicesIsSorted(Dices dices, List<Integer> toBeEquals) {
                return dices.getDicesIntStream()
                                .sorted().boxed().toList()
                                .equals(toBeEquals);
        }

        /**
         * Filters the dice values that occur at least a specified frequency.
         *
         * @param frequency The minimum frequency for dice values.
         * @param dices     The set of dice to filter.
         * @return An {@code IntStream} containing the filtered dice values.
         */
        static IntStream filterByFrequency(int frequency, Dices dices) {
                Collection<Integer> diceCollection = dices.getDicesIntStream()
                                .boxed().toList();
                return dices.getDicesIntStream()
                                .filter(v -> Collections.frequency(diceCollection, v) >= frequency);
        }

        /**
         * Checks if the dice values contain at least one value with an exact frequency.
         *
         * @param frequency The exact frequency to check.
         * @param dices     The set of dice to check.
         * @return {@code true} if the dice values contain at least one value with the
         *         exact frequency, {@code false} otherwise.
         */
        static boolean containsExactFrequencyDice(int frequency, Dices dices) {
                Collection<Integer> diceCollection = dices.getDicesIntStream()
                                .boxed().toList();
                return dices.getDicesIntStream()
                                .anyMatch(v -> Collections.frequency(diceCollection, v) == frequency);
        }
}
