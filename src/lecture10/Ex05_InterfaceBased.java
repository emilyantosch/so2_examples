/*
 * Lecture 10 – Implement Runnable (slides_010/main.typ:150)
 * Demo: Separate the task (Runnable) from its execution (Thread).
 */
package lecture10;

public class Ex05_InterfaceBased {
    // On the slide: separate file PrintRunnable.java
    public static class PrintRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hooray, I'm running in parallel!");
        }
    }

    public static void main(String[] args) {
        PrintRunnable task = new PrintRunnable();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Thread started");
    }
}
