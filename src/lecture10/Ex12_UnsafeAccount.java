/*
 * Lecture 10 – Shared Account, Concurrent Updates / A Lost Update (slides_010/main.typ:407, 430)
 * Question: Starting at €5000, two threads deposit and withdraw €50. Could the balance end at €4950?
 * Teaching model only: real money needs decimal or integer units and input validation.
 */
package lecture10;

public class Ex12_UnsafeAccount {
    static class Account {
        private double balance;
        public void deposit(double amount) {
            double newBalance = balance + amount;
            if (newBalance > balance)
                balance = newBalance;
        }
        public void withdraw(double amount) {
            double newBalance = balance - amount;
            if (newBalance >= 0.0)
                balance = newBalance;
        }
        public double getBalance() { return balance; }
    }

    static final int REPETITIONS = 1_000_000; // a single collision is rare, so repeat many times

    public static void main(String[] args) throws InterruptedException {
        Account account = new Account();
        account.deposit(5000);
        Runnable depositAndWithdraw = () -> {
            for (int i = 0; i < REPETITIONS; i++) {
                account.deposit(50);
                account.withdraw(50);
            }
        };
        Thread thread1 = new Thread(depositAndWithdraw);
        Thread thread2 = new Thread(depositAndWithdraw);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Expected: 5000.0");
        System.out.println("Actual:   " + account.getBalance());
    }
}

// Answer: Yes. Both threads read 5000; deposit writes 5050, then withdraw overwrites it with 4950
// (lost update). In this demo the final balance differs from 5000 on most runs.
