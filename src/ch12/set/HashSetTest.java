package ch12.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	Set<Object> hset = new HashSet<Object>();

	private void addMethod() {
		hset.add(new Integer(1));
		hset.add("Hello");
		hset.add("Hello");
		hset.add(null);
		hset.add(1);
		hset.add(new Phone("010", 500));
		hset.add(new Phone("011", 1000));
		System.out.println("데이터 추가 결과: " + hset);
	}

	private void retrieveMethod() {
		System.out.println("데이터 개수: " + hset.size());

		for (Object sobj : hset) {
			System.out.println("데이터 조회: " + sobj);
		}
	}

	private void removeMethod() {
		hset.remove("Hello");
		System.out.println("데이터 삭제 결과: " + hset);
	}

	public static void main(String[] args) {
		HashSetTest hst = new HashSetTest();
		hst.addMethod();
		hst.retrieveMethod();
		hst.removeMethod();
	}
}
