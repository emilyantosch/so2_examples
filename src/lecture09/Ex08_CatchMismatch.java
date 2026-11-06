/*
 * Lecture 9 – Catch the Exception (slides_009/main.typ:161)
 * Task: Handle invalid input in two ways: catch the exception, or check before reading. (Way 1)
 * This version assumes a token is available. EOF throws NoSuchElementException.
 */
package lecture09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08_CatchMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Entered: " + scanner.nextByte());
        } catch (InputMismatchException e) {
            System.out.println("Not a byte value: " + scanner.next());
        } finally {
            scanner.close();
        }
    }
}
