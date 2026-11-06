/*
 * Lecture 10 – Two Counters: The Worker / The Main Thread (slides_010/main.typ:174, 193)
 * Question: Predict the output. These are two separate counter fields, not shared state.
 */
package lecture10;

public class Ex06_Counters {
    static class CounterRunnable implements Runnable {
        private int counter;
        @Override
        public void run() {
            while (counter < 10) {
                System.out.println("Thread counter: " + counter++);
            }
            System.out.println("Exiting run()");
        }
    }

    private static int counter;

    public static void main(String[] args) {
        new Thread(new CounterRunnable()).start();
        while (counter < 10) {
            System.out.println("Main counter: " + counter++);
        }
        System.out.println("Exiting main()");
    }
}

// Answer: Both counters run from 0 to 9, but the interleaving differs from run to run.
// Neither thread is guaranteed to finish first; "Exiting run()" may appear after "Exiting main()".
