/*
 * Lecture 10 – The Monitor Belongs to the Object (slides_010/main.typ:474)
 * Demo: Same instance -> wait (BLOCKED). Different instances -> independent monitors.
 * Unsynchronized methods do not acquire the monitor and can still run.
 */
package lecture10;

public class Ex14_MonitorScope {
    static class Account {
        private final String name;
        Account(String name) { this.name = name; }

        public synchronized void slowUpdate(String who) {
            System.out.println(who + " owns monitor of " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(who + " releases monitor of " + name);
        }

        public void unsynchronizedPeek(String who) {
            System.out.println(who + " peeks at " + name + " without the monitor");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Account account1 = new Account("Account 1");
        Account account2 = new Account("Account 2");
        Thread a = new Thread(() -> account1.slowUpdate("A"));
        Thread b = new Thread(() -> account1.slowUpdate("B"));
        Thread c = new Thread(() -> account2.slowUpdate("C"));
        a.start();
        Thread.sleep(100); // let A acquire monitor 1 first
        b.start();
        c.start();
        Thread.sleep(100);
        System.out.println("B state: " + b.getState() + " (same instance -> wait)");
        System.out.println("C state: " + c.getState() + " (different instance -> runs)");
        account1.unsynchronizedPeek("main");
        a.join();
        b.join();
        c.join();
    }
}

// Output (typical): A and C own their monitors at the same time; B is BLOCKED until A releases monitor 1.
// main can call the unsynchronized method while A holds monitor 1.
