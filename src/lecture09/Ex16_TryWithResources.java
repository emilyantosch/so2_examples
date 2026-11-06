/*
 * Lecture 9 – Close Resources on Every Exit (slides_009/main.typ:360)
 * Demo: Closing the wrapper closes its underlying reader. FileReader / FileWriter charset constructors require Java 11+.
 * Run Ex17_WriteTextFile first, otherwise FileNotFoundException.
 */
package lecture09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ex16_TryWithResources {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Testdatei.txt", StandardCharsets.UTF_8))) {
            System.out.println(reader.readLine());
        }
    }
}

// Output (after Ex17_WriteTextFile): This is the first line.
