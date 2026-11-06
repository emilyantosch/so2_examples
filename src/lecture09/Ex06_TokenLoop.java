/*
 * Lecture 9 – Read Until End of Input / A Token Loop (slides_009/main.typ:109, 115)
 * Task: Read and print each token with next(). Stop at end of input.
 * Question: What changes if the loop condition is true?
 * Send EOF: Ctrl-D on an empty line (Unix), or Ctrl-Z then Enter (Windows). IntelliJ console: Cmd-D / Ctrl-D.
 */
package lecture09;

import java.util.Scanner;

public class Ex06_TokenLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
        // while (true) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}

// Answer: With while (true) the loop never ends normally. At EOF, next() throws
// NoSuchElementException and the program terminates with that exception.
