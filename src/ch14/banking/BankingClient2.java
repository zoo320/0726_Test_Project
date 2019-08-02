package ch14.banking;

public class BankingClient2 {
	public static void main(String[] args) {
		Account account = new SynchronizedAccount(5000);
		WithdrawThread iBanking = new WithdrawThread("인터넷뱅킹", account, 1000);
		WithdrawThread mBanking = new WithdrawThread("모바일뱅킹", account, 1000);
		iBanking.start();
		mBanking.start();
	}
}