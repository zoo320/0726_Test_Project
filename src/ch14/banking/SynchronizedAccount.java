package ch14.banking;

public class SynchronizedAccount extends Account {

	public SynchronizedAccount(int balance) {
		super(balance);
	}

	public synchronized int withdraw(int money) {
		String threadName = Thread.currentThread().getName();
		if (balance >= money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(threadName + " 출금: 잔액: " + balance);
		} else {
			System.out.println(threadName + ": 잔액 부족 출금 불가");
		}
		return balance;
	}

	public synchronized int deposit(int money) {
		return balance += money;
	}
}