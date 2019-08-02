package ch07.extend;

class Phone {
	public String number;

	public Phone aboutMe() {
		return this;
	}
}

class HandPhone extends Phone {
	public int weight = 100;

	@Override
	public HandPhone aboutMe() {
		return this;
	}
}

public class CovariantTest {
	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		Phone aboutMe = hp.aboutMe();
		if (aboutMe instanceof HandPhone) {
			System.out.println(((HandPhone) aboutMe).weight);
		}
		HandPhone aboutMe2 = hp.aboutMe();
		System.out.println(aboutMe2.weight);
	}
}
