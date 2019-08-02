package ch14.status;

public class DeadThreadTest {

	static class SomeThread extends Thread{
		public void run() {
			System.out.println("thread is over");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		SomeThread sThread = new SomeThread();
		sThread.start();
		Thread.sleep(1000*1);
		sThread.start();	//IllegalStateException 발생
	}
}