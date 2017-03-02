package ch05;

public class PremitiveVsReference {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		System.out.println("인텍스를 통해 기본형 배열의 값 변경");
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2; // 인덱스가 있으므로 배열의 공간에 할당된 값을 변경할 수 있다.
		}
		for (int i : arr) {
			System.out.printf("%d\t", i);
		}

		System.out.println("\n향상된 for 문에서 새로운 변수에 할당 후 값 변경");
		for (int i : arr) {
			i *= 2; // 새롭게 선언된 변수 i에 배열의 값을 할당했으므로 배열의 내용이 변경되지 않음
		}
		for (int i : arr) {
			System.out.printf("%d\t", i);
		}

		int[][] arr2 = { { 1 }, { 2 }, { 3 } };
		System.out.println("\n인덱스를 통해 참조형 배열(배열의 배열)의 값 변경");
		for (int i = 0; i < arr2.length; i++) {
			int[] subArr = arr2[i];
			subArr[0] *= 2;
		}
		for (int[] subArr : arr2) {
			for (int num : subArr) {
				System.out.printf("%d\t", num);
			}
		}
		
		System.out.println("\n향상된 for 문에서 새로운 변수에 할당 후 값 변경");
		for (int[] subArr : arr2) {
			subArr[0] *= 2;
		}
		for (int[] subArr : arr2) {
			for (int num : subArr) {
				System.out.printf("%d\t", num);
			}
		}
	}
}