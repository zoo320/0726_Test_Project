// ##DELETE FILE
package ch04.self;

public class ControlTest06 {
	public static void main(String[] args) {
		// TODO: int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		int inx = 15;
		if (10 < inx && inx < 20) {
			System.out.println("inx -- true");
		}
		// TODO: char형 변수 ch가 공백이나, 탭이 아닐 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch1 = ' ';
		if (ch1 != ' ' || ch1 != '\t') {
			System.out.println("ch1 -- true");
		}
		// TODO: char형 변수 ch가 ‘x’ 또는 ‘X’일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch2 = 'x';
		if (ch2 == 'x' || ch2 == 'X') {
			System.out.println("ch2 -- true");
		}
		// TODO: char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch3 = '0';
		if ('0' <= ch3 && ch3 <= '9') {
			System.out.println("ch3 -- true");
		}
		// TODO: char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		char ch4 = 'a';
		if (('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z')) {
			System.out.println("ch4 -- true");
		}
		// TODO: int형 변수 year가 400으로 나눠 떨어지거나, 또는( 4로 나눠 떨어지고 100으로 나눠 떨어지지 않을) 때 true인 if 문의 true 항목을 대체하시오. --> 윤년
		int year = 400;
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println("year -- true");
		}
		// TODO: boolean형 변수 powerOn가 false일 때 true인 조건식으로 if 문의 true 항목을 대체하시오.
		boolean powerOn = false;
		if (!powerOn) {
			System.out.println("powerOn -- true");
		}
	}
}
