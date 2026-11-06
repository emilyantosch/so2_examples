/*
 * Lecture 4 – Formatting and Locale (slides_004/main.typ:269)
 * Demo: The locale decides the decimal separator.
 */
package lecture04;

import java.util.Locale;

public class Ex12_FormatLocale {

    public static void main(String[] args) {
        double wind = 21.4532;
        System.out.println(String.format(Locale.US, "%.2f km/h", wind));
        System.out.println(String.format(Locale.GERMAN, "%.2f km/h", wind));
        System.out.println(String.format("%.2f km/h (default locale: %s)", wind, Locale.getDefault()));
    }
}

// Output:
// 21.45 km/h
// 21,45 km/h
// (third line depends on this machine's locale)
