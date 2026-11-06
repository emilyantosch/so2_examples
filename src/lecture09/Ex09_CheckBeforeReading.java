/*
 * Lecture 9 – Check Before Reading (slides_009/main.typ:180)
 * Task: Handle invalid input in two ways: catch the exception, or check before reading. (Way 2)
 * hasNextByte() does not consume input. Before retrying, consume an invalid token with next().
 */
package lecture09;

import java.util.Scanner;

public class Ex09_CheckBeforeReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextByte()) {
            System.out.println("Entered: " + scanner.nextByte());
        } else if (scanner.hasNext()) {
            System.out.println("Not a byte value: " + scanner.next());
        } else {
            System.out.println("End of input.");
        }
        scanner.close();
    }
}
