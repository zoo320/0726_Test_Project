package ch15.processing.object;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 3075830113306886480L;// 생성된 UID
	private String name;
	private int age;
	private transient String ssn;
	private LoginInfo lInfo;

	public Person(String name, int age, String ssn, String userId, String userPass) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.lInfo = new LoginInfo(userId, userPass);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + ", lInfo=" + lInfo + "]";
	}
}

class LoginInfo implements Serializable {
	private static final long serialVersionUID = 1L; // 기본값 사용
	private String userId;
	private transient String userPass;

	public LoginInfo(String userId, String userPass) {
		super();
		this.userId = userId;
		this.userPass = userPass;
	}

	public String toString() {
		return "LoginInfo [userId=" + userId + ", userPass=" + userPass + "]";
	}
}