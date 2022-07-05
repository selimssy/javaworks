package abstractex.phone;

public class PhoneTest {

	public static void main(String[] args) {
		
		//추상클래스는 객체 생성 불가
		// Phone phone = new Phone(); 
		
		SmartPhone smPhone = new SmartPhone("홍길동");
		
		smPhone.powerOn();   // 폰 전원을 켭니다.
		smPhone.internetSearch();   // 인터넷 검색을 합니다.
		smPhone.powerOff();  // 폰 전원을 끕니다.
		
	}

}
