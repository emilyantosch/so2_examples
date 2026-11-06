/*
 * Lecture 9 – Create, Inspect, Delete (slides_009/main.typ:307)
 * Demo: A File object represents a path; createNewFile · canRead · canWrite · delete
 */
package lecture09;

import java.io.File;
import java.io.IOException;

public class Ex13_CreateInspectDelete {
    public static void main(String[] args) throws IOException {
        File file = new File("Testdatei.txt");
        if (file.createNewFile()) {
            try {
                System.out.println("Read: " + file.canRead());
                System.out.println("Write: " + file.canWrite());
            } finally {
                if (!file.delete()) {
                    throw new IOException("Could not delete " + file);
                }
            }
        } else {
            System.out.println("Already exists; left unchanged.");
        }
    }
}

// Output (file did not exist): Read: true / Write: true
// After running Ex17_WriteTextFile the file exists: "Already exists; left unchanged."
