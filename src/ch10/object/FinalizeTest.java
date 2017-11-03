package ch10.object;

class GCTarget{
	private int seq;
	public GCTarget(int seq) {
		this.seq = seq;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println(seq+"번 자원 반납 등: "+Thread.currentThread().getName());
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		FinalizeTest ft = new FinalizeTest();
		for(int i=0; i<5; i++) {
			new GCTarget(i);
		}
		System.gc();
		System.out.println("프로그램 종료: "+Thread.currentThread().getName());
	}
}
