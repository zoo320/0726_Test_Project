package ch09.exception.custom;

public class UserManager {
	public boolean login1(String id, String pass) {
		return id.equals("hong") && pass.equals("1234");
	}

	public String login2(String id, String pass) {
		String msg = "성공";
		if (!id.equals("hong")) {
			msg = "실패:아이디 확인 필요";
		} else if (!pass.equals("1234")) {
			msg = "실패:비밀번호 확인 필요";
		}
		return msg;
	}
	public LoginInfo login3(String id, String pass) {
		LoginInfo info = new LoginInfo();
		if(!id.equals("hong")) {
			info.setSuccess(false);
			info.setMsg("아이디 확인 필요");
		}else if(!pass.equals("1234")) {
			info.setSuccess(false);
			info.setMsg("비밀번호 확인 필요");
		}
		return info;
	}
}

class LoginInfo{
	private String msg="성공";
	private boolean isSuccess=true;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
}