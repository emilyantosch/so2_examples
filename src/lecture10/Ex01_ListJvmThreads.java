/*
 * Lecture 10 – Which Threads Already Exist? (slides_010/main.typ:70)
 * Question: Besides main, which background work does the JVM perform?
 */
package lecture10;

public class Ex01_ListJvmThreads {
    public static void main(String[] args) {
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            System.out.printf("%-25s daemon=%-5b state=%s%n",
                thread.getName(), thread.isDaemon(), thread.getState());
        }
    }
}

// Answer: Besides main, e.g. Reference Handler, Finalizer, Signal Dispatcher,
// Common-Cleaner, Notification Thread (names vary by JVM). GC threads are native and not listed.
// All except main are daemon threads: they do not keep the JVM alive.
