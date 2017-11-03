package ch10.math;

import java.util.Random;

class MyDice {
	public int nextNum() {
		return (int) (Math.random() * 6) + 1;
	}
}
public class MyDiceTest {
	public static void main(String[] args) {
		MyDice dice = new MyDice();
		System.out.println(dice.nextNum());
	}
}

class YourDice{
	public int nextNum() {
		Random random = new Random();
		return random.nextInt(6)+1;
	}
}