/*
 * Lecture 10 – Protect the Whole Read–Check–Write (slides_010/main.typ:441, 447)
 * Task: Protect both account methods with the same monitor.
 */
package lecture10;

public class Ex13_SynchronizedAccount {
    static class Account {
        private double balance;
        public synchronized void deposit(double amount) {
            double newBalance = balance + amount;
            if (newBalance > balance)
                balance = newBalance;
        }
        public synchronized void withdraw(double amount) {
            double newBalance = balance - amount;
            if (newBalance >= 0.0)
                balance = newBalance;
        }
        public synchronized double getBalance() { return balance; }
    }

    static final int REPETITIONS = 1_000_000;

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

// Output: always "Actual: 5000.0". Each read–check–write runs under the account's monitor.
