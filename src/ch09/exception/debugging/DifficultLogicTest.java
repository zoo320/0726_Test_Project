package ch09.exception.debugging;

public class DifficultLogicTest {
	public DifficultLogicTest() {}
	public long factorial(int num) {
		if(num==1) {
			return 1;
		}else {
			return num * factorial(num-1);
		}
	}
	
	public static void main(String[] args) {
		DifficultLogicTest dlt = new DifficultLogicTest();
		System.out.println(dlt.factorial(5));
	}
}
