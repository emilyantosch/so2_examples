/*
 * Lecture 9 – List a Directory (slides_009/main.typ:330)
 * Demo: list() returns null if the path is not a directory or an I/O error occurs.
 */
package lecture09;

import java.io.File;
import java.io.IOException;

public class Ex14_ListDirectory {
    public static void main(String[] args) throws IOException {
        File directory = new File(".");
        String[] children = directory.list();
        if (children == null) {
            throw new IOException("Cannot list " + directory);
        }
        for (String child : children) {
            System.out.println(child);
        }
    }
}
