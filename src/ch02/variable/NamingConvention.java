package ch02.variable;

public class NamingConvention {

	public static void main(String[] args) {
		// int 3number; // 숫자로 시작할 수 없음
		// int number@; // _, $이외의 특수문자 사용 불가
		// int goto; // 예약어 사용 불가

		String userName = "Andy";
		String addr3 = "서울"; // 숫자는 처음만 아니면 사용 가능
		boolean gotoHome = false;// 예약어가 포함되는 것은 상관 없음
		double OS_VERSION = 5.0;
	}

}
