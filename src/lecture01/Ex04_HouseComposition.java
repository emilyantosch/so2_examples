/*
 * Lecture 1 – Composition (slides_001/main.typ:270)
 * Demo: Build classes from other classes: a House contains Windows, Walls, and Doors.
 */
package lecture01;

public class Ex04_HouseComposition {

    static class Window {
    }

    static class Wall {
    }

    static class Door {
    }

    static class House {
        // The house creates its parts: they live and die with it.
        private final Window[] windows = {new Window(), new Window(), new Window()};
        private final Wall[] walls = {new Wall(), new Wall(), new Wall(), new Wall()};
        private final Door[] doors = {new Door()};

        void describe() {
            System.out.println("House with " + windows.length + " windows, "
                    + walls.length + " walls and " + doors.length + " door");
        }
    }

    public static void main(String[] args) {
        House house = new House();
        house.describe();
    }
}
