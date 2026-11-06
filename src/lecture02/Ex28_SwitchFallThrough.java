/*
 * Lecture 2 – switch Statement (slides_002/main.typ:603)
 * Demo: No match and no default: skip the switch. Without break, execution falls
 *       through subsequent labels.
 */
package lecture02;

public class Ex28_SwitchFallThrough {

    public static void main(String[] args) {
        byte weekDay = 6;
        switch (weekDay) {
            case 6:
                System.out.println("Shopping");
                // no break: falls through
            case 7:
                System.out.println("Resting");
            default:
                System.out.println("Unknown day");
        }

        weekDay = 9;
        switch (weekDay) {
            case 6:
                System.out.println("Shopping");
                break;
        }
        System.out.println("No match, no default: switch skipped");
    }
}
