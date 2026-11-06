/*
 * Lecture 5 – What Does final Prevent? (slides_005/main.typ:505)
 * Demo: final variable / method / class. Final reference: no reassignment. The object may still change.
 */
package lecture05;

import java.util.ArrayList;

public class Ex16_Final {

    static class Person {
        public final String getKind() {
            return "Person";
        }
    }

    static class Pilot extends Person {
        // COMPILE ERROR: getKind() in Pilot cannot override getKind() in Person; overridden method is final
        // public String getKind() { return "Pilot"; }
    }

    // COMPILE ERROR: cannot inherit from final String
    // static class MyString extends String { }

    public static void main(String[] args) {
        final int maxPassengers = 180;
        // COMPILE ERROR: cannot assign a value to final variable maxPassengers
        // maxPassengers = 200;
        System.out.println("Max passengers: " + maxPassengers);

        final ArrayList<String> crew = new ArrayList<>();
        crew.add("Birgit");   // allowed: the object changes
        crew.add("Jan");
        // COMPILE ERROR: cannot assign a value to final variable crew
        // crew = new ArrayList<>();
        System.out.println("Crew: " + crew);

        System.out.println(new Pilot().getKind());
    }
}
