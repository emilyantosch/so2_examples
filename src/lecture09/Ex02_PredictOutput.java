/*
 * Lecture 9 – Predict the Output (slides_009/main.typ:61)
 * Question: Which call prints? Which returns a String? Is there a line break?
 */
package lecture09;

import java.util.Locale;

public class Ex02_PredictOutput {
    public static void main(String[] args) {
        double hawaii = 15.97;
        double hamburg = 22.71;
        String.format(Locale.ROOT, "Hawaii: %.1f °C", hawaii);
        System.out.printf(Locale.ROOT, "Hamburg: %.1f °C", hamburg);
    }
}

// Answer: Only printf prints: "Hamburg: 22.7 °C".
// String.format returns "Hawaii: 16.0 °C" as a String, which is discarded here.
// No line break: the format string has no %n (the terminal prompt may follow on the same line).
