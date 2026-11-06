/*
 * Lecture 10 – A Sleepy Worker / Predict the Output with and Without join() (slides_010/main.typ:355, 378)
 * Question: Compare join(), no join(), and join(1500). Which thread waits?
 */
package lecture10;

public class Ex11_JoinThreads {
    // On the slide: separate file SleepyThread.java
    public static class SleepyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("I'm sooo tired ...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            System.out.println("Okay, I'm awake again.");
        }
    }

    public static void main(String[] args)
            throws InterruptedException {
        SleepyThread sleepy = new SleepyThread();
        sleepy.start();
        while (sleepy.isAlive()) {
            System.out.println("Wake up!");
            Thread.sleep(400);
            sleepy.join();          // variant 1
            // (no join)            // variant 2: comment out the line above
            // sleepy.join(1500);   // variant 3
        }
        System.out.println("At last ...");
    }
}

// Answer: main waits (join), sleepy never waits for main.
// join():      "Wake up!" once, 5x "I'm sooo tired ...", "Okay, I'm awake again.", "At last ..."
// no join():   "Wake up!" every ~400 ms (about 12-13 times) interleaved with the 5 tired lines, then "At last ..."
// join(1500):  "Wake up!" roughly every 1900 ms (400 sleep + 1500 join), about 3 times, then "At last ..."
