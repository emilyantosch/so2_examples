/*
 * Lecture 9 – Three Standard Streams (slides_009/main.typ:76)
 * Demo: System.in · System.out · System.err; each stream can be redirected independently
 */
package lecture09;

public class Ex03_StandardStreams {
    public static void main(String[] args) {
        System.out.println("Standard output");
        System.err.println("Standard error (IntelliJ shows it in red)");
        // Try in a terminal: java lecture09.Ex03_StandardStreams 2> /dev/null
    }
}
