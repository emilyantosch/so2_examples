/*
 * Lecture 4 – String Formatting (slides_004/main.typ:201)
 * Question: What will this print?
 */
package lecture04;

import java.util.Locale;

public class Ex09_StringFormat {

    public static void main(String[] args) {
        double wind = 21.4532;
        String weather = String.format(Locale.US,
            "%s %d: %.1f km/h", "Station", 7, wind);
        System.out.println(weather);
    }
}

// Answer:
// Station 7: 21.5 km/h
