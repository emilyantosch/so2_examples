/*
 * Lecture 4 – Creating Strings (slides_004/main.typ:54)
 * Demo: Prefer a literal. Use `new` when you need a distinct String object.
 */
package lecture04;

public class Ex01_CreatingStrings {

    public static void main(String[] args) {
        String name = "Lena";
        String copy = new String("Lena");
        System.out.println(name + " / " + copy);
        System.out.println(name == copy);      // distinct objects
        System.out.println(name.equals(copy)); // same contents

        String old = name;
        name = "Birgit"; // changes the reference, not the original String
        System.out.println(name + " / " + old);
    }
}

// Output:
// Lena / Lena
// false
// true
// Birgit / Lena
