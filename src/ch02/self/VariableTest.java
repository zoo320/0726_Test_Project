package ch02.self;

public class VariableTest {
	public static void main(String[] args) {
		// TODO: 01. 지구에서 달까지의 거리는 38440000000km이다. 
		// @@ 이를 저장할 변수를 선언하고 값을 할당하시오.단, 단위는 생략한다.
		long distanceFromEarthToMoon = 38_440_000_000L;
		// END://
		// TODO: 02. 위에서 선언한 값을 "지구~달의 거리: 값km"의 형태로 출력하시오.
		System.out.printf("지구~달의 거리: %dkm%n", distanceFromEarthToMoon);
		System.out.println("지구~달의 거리: " + distanceFromEarthToMoon + "km");
		// END://
		int i1 = 70;
		// TODO: 03. i1을 문자 형태로 출력하시오.
		System.out.printf("%c%n", i1);
		System.out.println((char) i1);
		// END://
		char c1 = 'C';
		// TODO: 04. c1을 숫자 형태로 출력하시오.
		System.out.printf("%d%n", (int) c1);
		System.out.println((int) c1);
		// END://
		// TODO: 05. 아스키코드표를 참조해서 c1을 소문자로 출력하시오.
		System.out.printf("%c%n", c1 + 32);
		System.out.println((char) (c1 + 32));
		// END://
	}
}
