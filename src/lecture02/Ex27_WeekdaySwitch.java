/*
 * Lecture 2 – switch Statement (slides_002/main.typ:611, solution 615)
 * Task: Rewrite the weekday exercise using a classic switch statement.
 */
package lecture02;

public class Ex27_WeekdaySwitch {

    public static void main(String[] args) {
        byte weekDay = 3;
        switch (weekDay) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Working");
                break;
            case 6:
                System.out.println("Shopping");
                break;
            case 7:
                System.out.println("Resting");
                break;
            default:
                System.out.println("Unknown day");
        }
    }
}
