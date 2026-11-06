/*
 * Lecture 9 – Write a Text File (slides_009/main.typ:374)
 * Task: Write two lines to a file, then read and print them in a second program.
 * Second program: Ex18_ReadTextFile. This overwrites an existing file. Closing flushes buffered output.
 */
package lecture09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Ex17_WriteTextFile {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("Testdatei.txt", StandardCharsets.UTF_8))) {
            writer.write("This is the first line.");
            writer.newLine();
            writer.write("And here comes the second line.");
            writer.newLine();
        }
    }
}
