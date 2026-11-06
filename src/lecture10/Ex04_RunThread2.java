/*
 * Lecture 10 – A Thread Subclass (slides_010/main.typ:113, 119)
 * Task: Make the worker print a message. Call start(), not run().
 * Question: Which message appears first?
 */
package lecture10;

public class Ex04_RunThread2 {
    // On the slide: separate file PrintThread.java
    public static class PrintThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hooray, I'm running in parallel!");
        }
    }

    public static void main(String[] args) {
        PrintThread thread = new PrintThread();
        thread.start();
        System.out.println("Thread started");
    }
}

// Answer: Not determined. Usually "Thread started" first, because starting the new
// thread takes time while main just continues — but the scheduler decides.
