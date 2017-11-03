package ch10.system;

public class SystemClockTest {
	public static void main(String[] args) {
		long start = System.nanoTime();
		int num = 20;
		long result = getFactorial(num);
		System.out.println(num+"!은 "+result+"입니다.");
		long end = System.nanoTime();
		System.out.println("총 소요 시간(nanosec): "+(end - start));
	}
	public static long getFactorial(long num) {
		if(num==1) {
			return num;
		}else {
			return num * getFactorial(num-1);
		}
	}
}
