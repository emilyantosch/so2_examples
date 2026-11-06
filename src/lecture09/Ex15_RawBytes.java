/*
 * Lecture 9 – Read and Write Raw Bytes (slides_009/main.typ:349)
 * Demo: Program -> FileOutputStream -> File, File -> FileInputStream -> Program
 */
package lecture09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex15_RawBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("Rohdaten.bin");
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write(new byte[] {72, 105, (byte) 0xC3, (byte) 0xA4}); // "Hi" + UTF-8 bytes of 'ä'
        }
        try (FileInputStream in = new FileInputStream(file)) {
            int b;
            while ((b = in.read()) != -1) { // read() returns 0 ... 255, or -1 at EOF
                System.out.printf("%d (0x%02X)%n", b, b);
            }
        }
        if (!file.delete()) {
            throw new IOException("Could not delete " + file);
        }
    }
}

// Output: 72 (0x48), 105 (0x69), 195 (0xC3), 164 (0xA4)
// A byte stream sees four bytes; decoded as UTF-8 they are the three characters "Hiä".
