package ch04.self;

public class ControlTest05 {
	public static void main(String[] args) {
		// TOOD: 1+(-2)+3+(-4)+... 과 같은 식으로 더해나갈 때, 총합이 100이상이 되려면 몇까지 더해야 하는가?
		int sum = 0;
		int cnt = 0;
		while (true) {
			cnt++;
			sum += (cnt % 2 == 1) ? cnt : cnt * -1;

			if (sum >= 100) {
				break;
			}
		}
		System.out.println(cnt);
		// END://
	}
}
