package ch11.number;

import java.util.Random;

public class RandomTest {
	public static void playDice(Random random) {
		int step = random.nextInt(6);
		System.out.println((step + 1) + "만큼 전진");
	}
	
	public static void main(String[] args) {
		Random random = new Random();

		playDice(random);
		if (random.nextBoolean()) {
			System.out.println("보너스 스테이지");
			playDice(random);
		}
	}
}