/*
 * Lecture 4 – Boxing and Unboxing (slides_004/main.typ:657, 660)
 * Demo: Explicit vs. automatic conversion between int and Integer.
 */
package lecture04;

public class Ex31_Boxing {

    public static void main(String[] args) {
        // Explicit conversion
        Integer object = Integer.valueOf(24);
        int value = object.intValue();
        System.out.println(object + " " + value);

        // Automatic conversion
        Integer object2 = 24;
        int value2 = object2;
        System.out.println(object2 + " " + value2);

        Integer nothing = null;
        int boom = nothing; // unboxing null throws NullPointerException
    }
}

// Output:
// 24 24
// 24 24
// Exception in thread "main" java.lang.NullPointerException: ...
