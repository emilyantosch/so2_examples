/*
 * Lecture 10 – Continue Only After the Worker Ends (slides_010/main.typ:339)
 * Demo: join(ms) limits the wait; check isAlive() afterwards. A timeout does not stop the worker.
 */
package lecture10;

import lecture10.Ex05_InterfaceBased.PrintRunnable;

public class Ex10_JoinWorker {
    public static void main(String[] args)
            throws InterruptedException {
        Thread worker = new Thread(new PrintRunnable());
        worker.start();
        worker.join();
        System.out.println("We have joined!");
    }
}

// Output (always in this order):
// Hooray, I'm running in parallel!
// We have joined!
