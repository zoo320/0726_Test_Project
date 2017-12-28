package ch16.getstream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FromRangeTest {

	public static void main(String[] args) {
		IntStream iStream = IntStream.rangeClosed(1, 6);
		System.out.println("데이터 개수: "+iStream.count());
		
		Random random = new Random();
		LongStream lStream = random.longs(7, 1, 46);
		System.out.println("합: "+lStream.average().getAsDouble());
	}
}