package ch05.self;

public class ArrayTest02 {

	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55 };
		// TODO arr 배열 요소의 합과 평균을 구하시오.
		// @@ 단 평균은 소숫점 1자리까지 출력한다.
		int sum = 0;
		sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.printf("배열의 총 합은: %d, 평균은: %3.1f", sum, (sum * 1.0 / arr.length));
		// END://
	}
}