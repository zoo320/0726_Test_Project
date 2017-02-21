package ch03.self;

public class OperatorTest1 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		// TODO: 01. 위 화씨를 섭씨로 변경해서 출력하시오. 섭씨 = 5/9 * (화씨 - 32)
		// @@ 단 값은 총 5자리 숫자로 하고 소수점 이하는 3자리만 표시한다.
		double celcius = 5.0 / 9 * (fahrenheit - 32);
		System.out.printf("%5.3f", celcius);
		// END://
	}
}
