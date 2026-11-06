/*
 * Lecture 8 – Pass the Message to the Superclass (slides_008/main.typ:557)
 * Demo: Read the Custom Message (line 571). Output: Message: Invalid application state
 */
package lecture08;

public class Ex20_CustomMessage {
    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        try {
            throw new MyException("Invalid application state");
        } catch (MyException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
