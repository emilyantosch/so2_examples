/*
 * Lecture 4 – ArrayList Methods (slides_004/main.typ:541, 545)
 * Demo: size, get, contains, remove.
 */
package lecture04;

import java.util.ArrayList;

public class Ex26_ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String birgit = "Birgit";
        names.add("Lena");
        names.add(birgit);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        if (names.contains(birgit)) {
            names.remove(birgit);
        }
        System.out.println(names + ", size() = " + names.size());
    }
}

// Output:
// Lena
// Birgit
// [Lena], size() = 1
