/*
 * Lecture 4 – String Methods (slides_004/main.typ:180)
 * Question: What will this print?
 */
package lecture04;

public class Ex08_StringEquals {

    public static void main(String[] args) {
        String upper = "Welcome to Hamburg!";
        String lower = "welcome to hamburg!";

        System.out.println(lower.equals(upper));
        System.out.println(lower.equals(upper.toLowerCase()));
        System.out.println(lower.equalsIgnoreCase(upper));
    }
}

// Answer:
// false
// true
// true
// equals compares contents; == compares references.
