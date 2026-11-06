/*
 * Lecture 9 – Read a Line (slides_009/main.typ:88)
 * Question: Replace nextLine() with next(). What changes?
 */
package lecture09;

import java.util.Scanner;

public class Ex04_ReadLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        System.out.println(scanner.nextLine());
        // System.out.println(scanner.next());
        scanner.close();
    }
}

// Answer: nextLine() returns the whole line ("Hello Java").
// next() returns only the first whitespace-separated token ("Hello").
