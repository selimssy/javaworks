package information_hiding;

public class MyDateTest {

	public static void main(String[] args) {
		// MyDate 클래스의 객체 생성
		MyDate2 date = new MyDate2();
//		date.day = 20;
		
		date.setYear(2020);
		date.setMonth(2);
		date.setDay(29);
		
		
		
		System.out.println(date.getYear() +"년 " 
		+date.getMonth() + "월 " + date.getDay() +"일입니다." ) ;
	}

}
