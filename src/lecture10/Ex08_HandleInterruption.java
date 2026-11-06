/*
 * Lecture 10 – Handle Interruption (slides_010/main.typ:240)
 * Demo: Main sleeps, not worker. Restore the interrupt flag when you cannot propagate the exception.
 */
package lecture10;

import lecture10.Ex05_InterfaceBased.PrintRunnable;

public class Ex08_HandleInterruption {
    public static void main(String[] args) {
        Thread worker = new Thread(new PrintRunnable());
        worker.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Main is ready again");
    }
}
