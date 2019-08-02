package ch04.self;

public class ControlTest02 {
	public static void main(String[] args) {
		char c = 'z';
		// TODO: 02. boolean 타입의 변수 b를 선언하고 c알파벳이면 true를 아니면 false를 할당하시오.
		// @@ 할당 결과인 b를 출력하시오.
		boolean b = ('a' <= c && 'z' >= c) || ('A' <= c && 'Z' >= c);
		System.out.printf("c는 알파벳인가? %b%n", b);
		// END://
	}
}
