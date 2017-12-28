package ch14.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorVsArrayListTest {

	public static void testVector(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(i);
		}
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println(list.getClass().getName() + ": " + totalTime + " ms");
	}

	public static void main(String[] args) {
		testVector(new ArrayList<Integer>());
		testVector(new Vector<Integer>());

	}
}