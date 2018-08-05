package com.company;

public class WordWrap {

    public static String wrap(final String inputLine, final int lineLength) {
        final StringBuilder accumulator = new StringBuilder();
        final int length = inputLine.length();

        accumulator.append(inputLine, 0, Math.min(lineLength, length));

        int split = lineLength;
        while(length > split) {
            accumulator.append('\n');
            accumulator.append(inputLine, split, Math.min(split + lineLength, length));
            split += lineLength;
        }

        return accumulator.toString();
    }

}
