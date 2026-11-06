/*
 * Lecture 3 – `this` vs. `this(…)` (slides_003/main.typ:615, 629)
 * Demo: this(…) calls another constructor in the same class.
 */
package lecture03;

public class Ex20_ConstructorChaining {

    static class Aircraft {
        String model, airline;
        int numberEngines;

        Aircraft() {
            numberEngines = 1;
        }

        Aircraft(String model) {
            this();
            this.model = model;
        }

        Aircraft(String model, String airline) {
            this(model);
            this.airline = airline;
        }

        // COMPILE ERROR up to Java 24 ("flexible constructors is not supported"); compiles on Java 25+ (JEP 513)
        // Aircraft(int numberEngines) {
        //     this.numberEngines = numberEngines;
        //     this();
        // }
    }

    public static void main(String[] args) {
        Aircraft a = new Aircraft("A320", "Lufthansa");
        System.out.println(a.model + ", " + a.airline + ", engines: " + a.numberEngines);
    }
}

// Output:
// A320, Lufthansa, engines: 1
