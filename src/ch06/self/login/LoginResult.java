package ch06.self.login;

public class LoginResult {
	boolean result;
	String message;

	public void printResult() {
		System.out.println(this.result + " : " + this.message);
	}
}
