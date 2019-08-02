package ch14.collection;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ThreadSafeTest {
	static DecimalFormat df = new DecimalFormat("#,###ns");

	public static void test(List<Integer> list) throws InterruptedException {
		long start = System.nanoTime();
		Runnable r = () -> {
			try {
				for (int i = 0; i < 100; i++) {
					list.add(i);
				}
			} catch (Exception e) {
				String threadName = Thread.currentThread().getName();
				String exceptionInfo = e.getClass().getName() + " : " + e.getMessage();
				System.out.println(threadName + " : " + exceptionInfo);
			}
		};
		Thread t1 = new Thread(r, "t1");
		t1.start();
		Thread t2 = new Thread(r, "t2");
		t2.start();
		t1.join();
		t2.join();
		String elapsed = df.format(System.nanoTime() - start);
		System.out.println(list.getClass().getName() + ":" + list.size() + "개, 시간:" + elapsed);
	}

	public static void main(String[] args) throws InterruptedException {
		test(new Vector<Integer>());
		test(new ArrayList<Integer>());
		//test(Collections.synchronizedList(new ArrayList<>()));
	}
}