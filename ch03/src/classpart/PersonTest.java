package classpart;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();    // 기본생성자 사용
		Person p2 = new Person("추신수");   // 매개변수 있는 생성자 사용
		Person p3 = new Person("장그레", 165.9F, 55.3F);   // 매개변수 있는 생성자 사용
		// p3같은 방법을 제일 많이 쓴다!
		
		// p1 입력
		p1.name = "손흥민";
		p1.height = 183.2F;
		p1.weight = 76.7F;
		
		
		// p2 입력
		p2.height = 180.3F;
		p2.weight = 90.2F;
		
		
		// 출력
		p1.showInfo();   //사람을 생성합니다 // 이름: 손흥민, 키: 183.2, 몸무게: 76.7
		p2.showInfo();   // 이름: 추신수, 키: 180.3, 몸무게: 90.2
		p3.showInfo();   // 이름: 장그레, 키: 165.9, 몸무게: 55.3

	}

}
