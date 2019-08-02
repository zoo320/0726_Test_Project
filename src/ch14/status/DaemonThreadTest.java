package ch14.status;

public class DaemonThreadTest {
	static class SaveDaemon extends Thread {
		public SaveDaemon() {
			this.setDaemon(true);
		}

		public void run() {
			while (true) {
				try {
					Thread.sleep(1000 * 5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("자동 저장함");
			}
		}
	}

	public static void main(String args[]) {
		Thread daemon = new SaveDaemon();
		daemon.start();

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("작업 중... " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main over");
	}
}