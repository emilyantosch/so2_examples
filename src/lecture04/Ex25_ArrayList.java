/*
 * Lecture 4 – Creating an ArrayList (slides_004/main.typ:520)
 * Demo: Lists allow duplicates. This list has four elements.
 */
package lecture04;

import java.util.ArrayList;

public class Ex25_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Birgit");
        names.add("Jan");
        names.add(new String("Jan"));

        System.out.println(names);
        System.out.println(names.size());
    }
}

// Output:
// [Lena, Birgit, Jan, Jan]
// 4
