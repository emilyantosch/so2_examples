/*
 * Lecture 10 – Java Thread.State (slides_010/main.typ:224)
 * Demo: NEW -> RUNNABLE -> TIMED_WAITING (sleep) -> TERMINATED
 */
package lecture10;

public class Ex07_ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("After new:   " + worker.getState());
        worker.start();
        System.out.println("After start: " + worker.getState());
        Thread.sleep(100);
        System.out.println("In sleep():  " + worker.getState());
        worker.join();
        System.out.println("After join:  " + worker.getState());
    }
}

// Output (typical): NEW, RUNNABLE, TIMED_WAITING, TERMINATED
// A terminated thread cannot restart; its Java object still exists.
