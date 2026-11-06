/*
 * Lecture 9 – Tokens Are Not Lines (slides_009/main.typ:103)
 * Demo: After nextInt(), nextLine() reads the rest of the current line—possibly empty.
 */
package lecture09;

import java.util.Scanner;

public class Ex05_TokensNotLines {
    public static void main(String[] args) {
        // A String source simulates typed input, so the demo is reproducible.
        Scanner scanner = new Scanner("Hello Java\n42\nHamburg\n");
        System.out.println("next():     \"" + scanner.next() + "\"");
        System.out.println("nextLine(): \"" + scanner.nextLine() + "\"");
        System.out.println("nextInt():  " + scanner.nextInt());
        System.out.println("nextLine(): \"" + scanner.nextLine() + "\"  <- rest of the line, empty");
        System.out.println("nextLine(): \"" + scanner.nextLine() + "\"");
        scanner.close();
    }
}

// Output:
// next():     "Hello"
// nextLine(): " Java"
// nextInt():  42
// nextLine(): ""  <- rest of the line, empty
// nextLine(): "Hamburg"
