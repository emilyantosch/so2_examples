/*
 * Lecture 4 – String Formatting (slides_004/main.typ:249)
 * Question: How do width and precision affect the output?
 */
package lecture04;

import java.util.Locale;

public class Ex11_FormatWidth {

    public static void main(String[] args) {
        double wind = 21.4532;
        System.out.println(String.format(Locale.US, "%2.2f km/h", wind));
        System.out.println(String.format(Locale.US, "%8.2f km/h", wind));
        System.out.println(String.format(Locale.US, "%08.2f km/h", wind));
    }
}

// Answer:
// 21.45 km/h
//    21.45 km/h
// 00021.45 km/h
// Width is a minimum (2 is too small, so it is ignored); precision = digits after the point.
