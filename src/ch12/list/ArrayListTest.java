package ch12.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	List<Object> list = new ArrayList<>();
	
	List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

	public void createTest() {
		list.add("Hello");
		list.add("Hello"); // 동일 데이터 추가
		list.add(null); // null 추가
		list.addAll(integers); // 다른 Collection 요소 추가
		list.add(integers); // 다른 Collection 추가
		list.add(0, new Object()); // 끼워 넣기
		System.out.println("추가 후 내용 출력: " + list);
	}

	public void retrieveTest() {
		// 반복을 이용한 요소 조회
		for(int i=0; i<list.size(); i++) {				// 리스트의 크기 조회
			System.out.println(i+" : "+list.get(i));	// 특정 인덱스의 객체 조회
		}
		// 포함 여부의 활용
		if (list.contains("Hello")) {	// 객체의 포함 여부 
			System.out.println("Hello의 위치는: " + list.indexOf("Hello"));	// 객체의 위치 조회
		}
		// 서브 리스트 활용
		List<Object> sub = list.subList(3, 5);
		System.out.println("sub의 내용: "+sub);
		System.out.println("sub의 내용을 다 가지고 있는가? " + list.containsAll(sub));
	}

	public void updateTest() {
		list.set(1, "updated");
		System.out.println("업데이트 후: "+list);
	}

	public void deleteTest() {
		list.remove(0);			// 특정 위치의 객체 삭제
		list.remove("Hello");	// 특정 객체가 있다면 처음 객체 삭제
		// 타입이 Integer인 경우 삭제
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) instanceof Integer) {
				list.remove(i);
			}
		}
		System.out.println("삭제 후 : " + list);
		list.clear();// 리스트 초기화
		System.out.println("초기화 후 : " + list);
	}

	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.createTest();
		alt.retrieveTest();
		alt.updateTest();
		alt.deleteTest();
	}
}