/*
 * Lecture 4 – String Methods (slides_004/main.typ:171)
 * Task: Replace “Humbug” with “Hamburg”.
 */
package lecture04;

public class Ex07_ReplaceHumbug {

    public static void main(String[] args) {
        String hamburg = "Welcome to Humbug!";
        hamburg = hamburg.replace("Humbug", "Hamburg");
        System.out.println(hamburg);
    }
}

// Output:
// Welcome to Hamburg!
// Without the assignment nothing changes: replace() returns a new String.
