/*
 * Lecture 2 – if-else Exercise (slides_002/main.typ:571, solution 576)
 * Task: Given weekDay from 1 (Monday) to 7 (Sunday), print the matching activity.
 */
package lecture02;

public class Ex26_WeekdayIfElse {

    public static void main(String[] args) {
        byte weekDay = 7;
        if (weekDay <= 5) {
            System.out.println("Working");
        } else if (weekDay == 6) {
            System.out.println("Shopping");
        } else if (weekDay == 7) {
            System.out.println("Resting");
        }
    }
}
