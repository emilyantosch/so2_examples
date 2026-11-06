/*
 * Lecture 4 – String Methods (slides_004/main.typ:166)
 * Demo: `charAt(0)` returns the first character. Indices start at zero.
 */
package lecture04;

import java.util.Arrays;

public class Ex06_StringMethods {

    public static void main(String[] args) {
        String city = "Hamburg";

        // Inspect
        System.out.println(city.length());
        System.out.println(city.charAt(0));
        // Find
        System.out.println(city.indexOf("burg"));
        System.out.println(city.contains("Ham"));
        // Transform
        System.out.println(city.replace("burg", "mer"));
        System.out.println(city.toLowerCase());
        // Compare
        System.out.println(city.equals("hamburg"));
        System.out.println(city.equalsIgnoreCase("hamburg"));
        // Split
        String[] parts = "Hamburg,Berlin,Bremen".split(",");
        System.out.println(Arrays.toString(parts));

        System.out.println(city); // unchanged: Strings are immutable
    }
}

// Output:
// 7
// H
// 3
// true
// Hammer
// hamburg
// false
// true
// [Hamburg, Berlin, Bremen]
// Hamburg
