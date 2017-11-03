package ch06.self.login;

public class LoginTest {
	public static void main(String[] args) {
	    Login login = new Login();
	    LoginResult result = login.doLogin("hong", "1234");
	    result.printResult();
	    //false : 아이디를 확인하세요.

	    result = login.doLogin("admin", "12345");
	    result.printResult(); // false : 비밀번호를 확인하세요.

	    result = login.doLogin("admin", "1234");
	    result.printResult();// true : admin님 반갑습니다.
	  }
}
