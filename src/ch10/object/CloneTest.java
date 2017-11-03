package ch10.object;
public class CloneTest {

	public static void main(String[] args) {
		int [] intArr1 = {1,2,3,4,5};
		int [] cloned = intArr1.clone();
		for(int i : cloned) {
			System.out.printf("%d\t", i);
		}
	}
}