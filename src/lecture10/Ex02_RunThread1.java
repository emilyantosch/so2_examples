/*
 * Lecture 10 – Start an Empty Thread (slides_010/main.typ:95)
 * Task: Create and start an additional thread.
 * Why does the worker print nothing? No task was supplied to run().
 */
package lecture10;

public class Ex02_RunThread1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println("Object created");
        thread.start();
        System.out.println("Thread started");
    }
}
