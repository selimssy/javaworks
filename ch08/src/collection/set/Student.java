package collection.set;

public class Student {

	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode();    // name이 키가 되서 비교 가능
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			// name만 비교해도 가능(name을 hashcode로 재정의했기 때문에)
			if((std.name.equals(name)) && std.age == age) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
}
