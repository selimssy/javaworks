package statics;

public class StudentTest {

	public static void main(String[] args) {
		Student lee = new Student();
		Student han = new Student();
		
		lee.setName("이대한");
		han.setName("한지수");
		
		//System.out.println(lee.serialNum);  // static 붙어있으면 class 이름으로 직접 접근해야(이건 객체로 접근한거)!
		Student.serialNum++;
		System.out.println(Student.serialNum);   // 클래스로 직접 접근
		System.out.println(lee.getName());
		
		Student.serialNum++;
		System.out.println(Student.serialNum);
		System.out.println(han.getName());
	}

}
