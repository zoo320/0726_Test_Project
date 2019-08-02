package ch14.status;

public class InterruptTest {
	static class MinuteAlarmThread extends Thread {
		public void run() {
			try {
				Thread.sleep(1000 * 60);
			} catch (InterruptedException e) {
				System.out.println("깜짝이야.");
			}
			System.out.println("시간이 되었습니다.");
		}
	}

	public static void main(String[] args) {
		Thread timeChecker = new MinuteAlarmThread();
		timeChecker.start();

		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		timeChecker.interrupt();
	}
}