package org.kata;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Order {

    private static final String SPACE = " ";

    public static String order(String words) {
        if (words.isEmpty()) {
            return words;
        }

        final List<String> stringMap = Arrays.stream(words.split(SPACE))
                                             .sorted(Comparator.comparingInt(Order::parseNumber))
                                             .collect(toList());

        return String.join(SPACE, stringMap);
    }

    private static int parseNumber(final String word) {
        for (int i = 0; i < word.length(); i++) {
            final String c = String.valueOf(word.charAt(i));
            try {
                return Integer.valueOf(c);
            } catch (NumberFormatException ignored) {

            }
        }

        return -1;
    }
}