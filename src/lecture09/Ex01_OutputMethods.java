/*
 * Lecture 9 – Choose an Output Method (slides_009/main.typ:56)
 * Demo: print("Hi") · println("Hi") · printf("%.1f", 2.75) · PrintStream.format works like printf
 */
package lecture09;

import java.util.Locale;

public class Ex01_OutputMethods {
    public static void main(String[] args) {
        System.out.print("Hi");
        System.out.println("Hi");
        System.out.printf("%.1f", 2.75);
        System.out.println();
        System.out.format(Locale.ROOT, "%.1f%n", 2.75);
        System.out.printf(Locale.GERMANY, "%.1f%n", 2.75); // number formatting depends on locale
    }
}
