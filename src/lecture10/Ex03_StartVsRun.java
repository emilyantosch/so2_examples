/*
 * Lecture 10 – start() Creates Concurrency; run() Contains Work / Object Creation Is Not Thread Start (slides_010/main.typ:85, 90)
 * Demo: Calling run() directly is an ordinary call on the current thread. A thread can be started only once.
 */
package lecture10;

public class Ex03_StartVsRun {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->
            System.out.println("run() executes on: " + Thread.currentThread().getName()));
        thread.run();   // ordinary call -> "main"
        thread.start(); // new thread -> "Thread-0"
        thread.start(); // IllegalThreadStateException: a thread can be started only once
    }
}
