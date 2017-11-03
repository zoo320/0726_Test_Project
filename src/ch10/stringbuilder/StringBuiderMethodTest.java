package ch10.stringbuilder;

public class StringBuiderMethodTest {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("사봉-용산-사가정-용마산");
		builder.append("-중곡");	// 맨 뒤에 -중곡 추가
		System.out.println(builder);
		builder.insert(3, "면목-");	// 사봉-뒤에 면목-추가
		System.out.println(builder);
		builder.delete(5, 8);		// -용산 삭제
		System.out.println(builder);
		builder.replace(0, 1, "상");// 사를 상으로 변경
		System.out.println(builder);	
	}
}