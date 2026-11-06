/*
 * Lecture 9 – Read Individual Character Values (slides_009/main.typ:253)
 * Question: What happens after typing A and pressing Enter?
 * read() returns a UTF-16 code unit as an int, or −1 at EOF.
 */
package lecture09;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11_ReadCharValues {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.print("Please enter a character: ");
        System.out.println(reader.read());
        System.out.println(reader.read());
        System.out.println(reader.read());
        reader.close();
    }
}

// Answer (see "Enter Does Not Always Mean 13, 10", main.typ:271):
// A + CRLF (Windows):       65, 13, 10
// A + LF (macOS / Linux):   65, 10, then the third read() blocks until more input or EOF
// EOF (Ctrl-D) at that point prints -1.
