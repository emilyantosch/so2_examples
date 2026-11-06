/*
 * Lecture 9 – Read Until EOF, Not Until ready() Is False (slides_009/main.typ:393)
 * Task (second program): read and print the lines written by Ex17_WriteTextFile.
 * ready() checks whether reading can proceed without blocking. It is not an EOF test.
 */
package lecture09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ex18_ReadTextFile {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("Testdatei.txt", StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}

// Output (after Ex17_WriteTextFile):
// This is the first line.
// And here comes the second line.
// Without the file: FileNotFoundException.
