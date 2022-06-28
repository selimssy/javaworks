package thisexample;


class Person{
	String name;
	int age;
	
	Person(){  // 갖춰진(여기선 아래 Person(String name, int age) 생성자)를 호출한다
		this("이름 없음", 1);   // 이거 모르겠다....
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	
	// 객체를 반환하는 함수
	Person returnSelf() {
		return this;
	}
	
	
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person noName = new Person();
		Person son = new Person("손흥민", 31);    // 이건 매개변수 있는 생성자 사용한거
		
		System.out.println(noName.name);
		System.out.println(son.name);
		
		Person p = noName.returnSelf();   // 객체를 반환
		System.out.println(p);
		System.out.println(noName);
		

	}

}
