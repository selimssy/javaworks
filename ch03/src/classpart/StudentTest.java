package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 사용
		// Student() : 생성자
		Student std1 = new Student();
		Student std2 = new Student();
		
		
		//student 멤버에 접근
		std1.studentId = 100;
		std1.studentName = "다있소";
		
		std2.studentId = 101;
		std2.studentName = "장그레";
		
		System.out.println("학번: " + std1.studentId);   // 학번: 100
		System.out.println("이름: " + std1.studentName);  // 이름: 다있소
		
		System.out.println("학번: " + std2.studentId);   // 학번: 101
		System.out.println("이름: " + std2.studentName);  // 이름: 장그레
		
		
		
		
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.studentId = 102;
		s1.studentName = "다이소";
		
		s2.studentId = 103;
		s2.studentName = "장그레";
		
		
		s1.showInfo();   // 학번:102, 이름:다이소
		s2.showInfo();   // 학번:103, 이름:장그레
		
		
		// 인스턴스 출력 - heap 메모리에 적재
		// 패키지이름.클래스이름으로 출력된다
		System.out.println(s1);   // classpart.Student@167fdd33
		System.out.println(s2);   // classpart.Student@1e965684
		
		
	}

}
