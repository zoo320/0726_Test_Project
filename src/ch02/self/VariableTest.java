package ch02.self;

public class VariableTest {
	public static void main(String[] args) {
		// TODO 01.지구에서 달까지의 거리는 38440000000km이다. 이를 저장할 변수를 선언하고 값을 할당하시오.단, 단위는 생략
		long distanceFromEarthToMoon = 38_440_000_000L;
		// TODO 02."지구에서 달까지의 거리 : 값km"의 형태로 출력하시오.
		System.out.printf("지구에서 달까지의 거리: %dkm%n", distanceFromEarthToMoon);
		System.out.println("지구에서 달까지의 거리: " + distanceFromEarthToMoon + "km");
		// TODO 03. i1을 문자 형태로 출력하시오.
		int i1 = 70;
		System.out.printf("%c%n", i1);
		System.out.println((char) i1);
		// TODO 04. c1을 숫자 형태로 출력하시오.
		char c1 = 'C';
		System.out.printf("%d%n", (int) c1);
		System.out.println((int) c1);
		// TODO 05. 아스키코드표를 참조해서 c1을 소문자로 출력하시오.
		System.out.printf("%c%n", c1 + 32);
		System.out.println((char) (c1 + 32));
		System.out.println(Integer.toBinaryString(-100));
	}
}
