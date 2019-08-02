package ch04.self;

public class ControlTest04 {
	public static void main(String[] args) {
		// TODO: 1+(1+2)+(1+2+3)+...+(1+2+3+4+5+6+7+8+9+10)의 값은?
		int sum = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1;i>=j && j<=10; j++) {
				sum+=j;
			}
		}
		System.out.println("sum: "+sum);
		// END://
	}
}
