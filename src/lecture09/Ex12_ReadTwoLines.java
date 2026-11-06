/*
 * Lecture 9 – Read Two Lines (slides_009/main.typ:276, 282)
 * Task: Read two lines with BufferedReader, then print both. Close the outer reader.
 */
package lecture09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12_ReadTwoLines {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        System.out.print("First line: ");
        String line1 = bufferedReader.readLine();
        System.out.print("Second line: ");
        String line2 = bufferedReader.readLine();
        System.out.println(line1);
        System.out.println(line2);
        bufferedReader.close();
    }
}
