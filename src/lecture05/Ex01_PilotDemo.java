/*
 * Lecture 5 – Task: Person and Pilot (slides_005/main.typ:59)
 * Task: Create Person and Pilot. Create a Pilot object and print its name.
 */
package lecture05;

public class Ex01_PilotDemo {

    // On the slides each public class lives in its own file; nested here to keep one runnable file.
    static class Person {
        String name;
    }

    static class Pilot extends Person {
        int flightHours;
    }

    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        pilot.name = "Lukas Luft";
        pilot.flightHours = 1482;
        System.out.println("Name: " + pilot.name);
        System.out.println("Flight hours: " + pilot.flightHours);
    }
}
