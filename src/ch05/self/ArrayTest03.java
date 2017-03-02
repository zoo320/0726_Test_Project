package ch05.self;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[][] arr2 = { { 1, 2, 4, 5 }, { 10, 20, 30, 40, 50 }, { 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		// TODO arr2의 모든 값들의 총 합과 평균을 구하시오.
		// @@ 단 평균은 소수점 한 자리까지 출력한다.
		int sum = 0;
		int count = 0;

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum += arr2[i][j];
				count++;
			}
		}
		System.out.printf("배열의 총 합은: %d, 평균은: %3.1f", sum, (sum * 1.0 / count));
		// END://
	}
}
