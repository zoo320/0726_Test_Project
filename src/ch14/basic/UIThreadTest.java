package ch14.basic;

import java.util.Random;

import javax.swing.JOptionPane;

public class UIThreadTest {

	public static void main(String[] args) {
		Random random = new Random();
		int first = random.nextInt(9) + 1;
		int second = random.nextInt(9) + 1;

		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ignore) {
			}
			System.out.println("count down: " + i);
		}

		String result = JOptionPane.showInputDialog(first + "* " + second + "?");
		System.out.println("입력: " + result + ", 정답은: " + (first * second));
	}
}
/*
 		new Thread(()-> {
			for(int i=10; i>0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ignore) {	}
				System.out.println("count down: "+ i);
			}
		}).start();;
 */