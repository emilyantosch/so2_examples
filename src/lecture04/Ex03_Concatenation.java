/*
 * Lecture 4 – String Concatenation (slides_004/main.typ:105)
 * Demo: Use `+` to concatenate text; `+=` reassigns the result.
 */
package lecture04;

public class Ex03_Concatenation {

    public static void main(String[] args) {
        String name = "Lena " + "or " + "then ";
        name = name + "after all " + "again ";
        name += "Birgit?";
        System.out.println(name);
    }
}

// Output:
// Lena or then after all again Birgit?
