/*
 * Lecture 9 – Task: Read a Vector (slides_009/main.typ:199, 205, 223)
 * Task: Read int components until a non-integer token or EOF. Print the vector and its magnitude.
 */
package lecture09;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex10_ReadVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> vector = new ArrayList<>();
        while (scanner.hasNextInt()) {
            vector.add(scanner.nextInt());
        }
        scanner.close();
        printVector(vector);
    }

    static void printVector(ArrayList<Integer> vector) {
        double sumOfSquares = 0;
        for (int component : vector) {
            sumOfSquares += (double) component * component;
        }
        System.out.println("a = " + vector + "^T");
        System.out.printf(Locale.ROOT, "||a|| = %.2f%n",
            Math.sqrt(sumOfSquares));
    }
}

// Example: input "3 4 x" -> a = [3, 4]^T, ||a|| = 5.00
// Convert before multiplication to avoid int overflow. An empty vector has magnitude 0.
