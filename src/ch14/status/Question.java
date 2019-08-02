package ch14.status;

import java.util.Random;

public class Question {
	int first;
	int second;
	int answer;
	int rightAnswer;
	long elapsedTime;

	public Question() {
		Random random = new Random();
		this.first = random.nextInt(9) + 1;
		this.second = random.nextInt(9) + 1;
		this.rightAnswer = first * second;
	}

	public String printQuestion() {
		return first + "*" + second + "=";
	}

	public void setResult(int answer, long elapsedTime) {
		this.answer = answer;
		this.elapsedTime = elapsedTime;
	}

	@Override
	public String toString() {
		String result = answer == rightAnswer ? "정답!" : "오답! 정답은 " + rightAnswer;
		return result + ", 소요시간:" + elapsedTime;
	}
}