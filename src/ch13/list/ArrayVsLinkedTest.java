package ch13.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinkedTest {
	private static void addTest(String testcase, List<Object> list) {
		long start = System.nanoTime();
		for (int i = 0; i < 1000000; i++) {
			list.add(new String("Hello"));
		}
		long end = System.nanoTime();
		System.out.println(testcase + " 소요시간 : " + (end - start));
	}

	private static void addTest2(String testcase, List<Object> list) {
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list.add(0, new String("Hello"));
		}
		long end = System.nanoTime();
		System.out.println(testcase + " 소요시간 : " + (end - start));
	}

	private static void accessTest(String testcase, List<Object> list) {
		long start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			list.get(i);
		}
		long end = System.nanoTime();
		System.out.println(testcase + " 소요시간 : " + (end - start));
	}

	public static void main(String[] args) {
		ArrayList<Object> alist = new ArrayList<Object>();
		LinkedList<Object> llist = new LinkedList<Object>();

		addTest("순차적 추가: ArrayList", alist);
		addTest("순차적 추가: LinkedList", llist);

		addTest2("중간에 추가: ArrayList", alist);
		addTest2("중간에 추가: LinkedList", llist);

		accessTest("데이터 접근: ArrayList", alist);
		accessTest("데이터 접근: LinkedList", llist);
	}
}
