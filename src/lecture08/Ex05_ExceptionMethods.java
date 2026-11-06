/*
 * Lecture 8 – Inspect the Exception Object (slides_008/main.typ:218)
 * Demo: getMessage() -> detail message, toString() -> type + message,
 *       printStackTrace() -> trace to standard error.
 */
package lecture08;

public class Ex05_ExceptionMethods {
    public static void main(String[] args) {
        try {
            Integer.parseInt("12a4");
        } catch (NumberFormatException e) {
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("toString():   " + e.toString());
            System.out.println("printStackTrace():");
            e.printStackTrace();
        }
        System.out.println("Exiting main()");
    }
}
