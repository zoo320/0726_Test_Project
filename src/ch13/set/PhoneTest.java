package ch13.set;

import java.util.HashSet;
import java.util.Set;

public class PhoneTest {
	public static void main(String[] args) {
		Set<Phone2> pSet = new HashSet<>();
		pSet.add(new Phone2("010", 2000));
		pSet.add(new Phone2("010", 2000));
		pSet.add(new Phone2("011", 3000));
		pSet.add(new Phone2("011", 3000));
		pSet.add(new Phone2("011", 1000));
		System.out.println("set의 크기: " + pSet.size());
		for(Phone2 phone: pSet) {
			System.out.println(phone);
		}
	}
}