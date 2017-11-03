package ch06.self.login;

public class Login {
	public LoginResult doLogin(String id, String pass) {
		LoginResult result = new LoginResult();
		if(id=="admin" && pass=="1234" ) {
			result.result = true;
			result.message=id+"님 반갑습니다.";
		}else if(id!="admin") {
			result.message = "아이디를 확인하세요.";
		}else {
			result.message="비밀번호를 확인하세요.";
		}
		return result;
	}
}
