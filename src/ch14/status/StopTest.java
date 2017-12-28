package ch14.status;

import java.util.Scanner;

public class StopTest {
	static class ResourceUseThread extends Thread {
		boolean flag = true;

		public void run() {
			System.out.println("자원 획득");
			while (flag) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                System.out.print("자원사용");
			}
			System.out.println("자원 반납");
		}
	}

	public static void main(String[] args) {
		ResourceUseThread t = new ResourceUseThread();
		t.start();

		Scanner scan = new Scanner(System.in);
		if (scan.nextLine().equals("s")) {
			t.stop();
		} else {
			t.flag = false;
		}
		scan.close();
		System.out.println("main over");
	}
}