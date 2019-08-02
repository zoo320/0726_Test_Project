package ch14.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolGuguTest {
	private static int[][] gugudan = new int[9][9];
	private static int dans = 0;
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int processCnt = Runtime.getRuntime().availableProcessors();
		System.out.println("VM에서 운용 가능한 프로세서 개수: " + processCnt);
		ExecutorService es = Executors.newFixedThreadPool(processCnt);
		System.out.println("작업 시작 전: " + es);

		Callable<String> callable = () -> {
			int dan = ++dans;
			for (int i = 1; i < 10; i++) {
				gugudan[dan - 1][i - 1] = dan * i;
			}
			return dan + " 작업 완료, " + Thread.currentThread().getName();
		};
		for (int i = 0; i < 9; i++) {
			Future<String> guguFuture = es.submit(callable);
			new Thread(() -> {
				try {
					System.out.println(guguFuture.get());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}).start();
		}

		Thread.sleep(1000 * 5);
		System.out.println("작업 종료 후: " + es);
		for (int[] dans : gugudan) {
			for (int num : dans) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
		es.shutdown();
	}
}