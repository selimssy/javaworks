package jdbcproject;

// VO(Value Object)
public class Person {
	private String userId;     //똑같이 써야되긴 하는데 자바식으로 다음단어 대문자로!
	private String userPw;
	private String name;
	private int age;
	
	
	// setter, getter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
	public String getUserPw() {
		return userPw;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
}
