package ch14.basic;

public class SimpleThreadTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<30; i++) {
					System.out.print("-");
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0; i<30; i++) {
				System.out.print("@");
			}
		});
		// start가 아닌 경우는 단순히 메인 스레드에서 호출됨
		t1.run();
		t2.run();
		System.out.println("main is over");
	}
}