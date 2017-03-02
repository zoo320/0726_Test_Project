package ch05.self;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO 파라미터로 1자리 숫자를 입력 받아 1부터 100까지의 정수 중 파라미터의 배수만을 더한 결과를 출력하시오.
		// @@ 단 파라미터가 없을 경우 5를 할당한다.
		// @@ 예) 9 입력 시: 9  + 18 + 27 + 36 + 45 + 54 + 63 + 72 + 81

		int num = args.length > 0 ? Integer.parseInt(args[0]) : 5;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % num == 0) {
				sum += i;
			}
		}
		System.out.println("1~100까지 " + num + "의 배수의 합은 : " + sum);
		// END://
	}
}
