package information_hiding;

public class MyDate2 {
	
	//필드
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	
	
	public void setDay(int day) {
		if(month == 2) {
			if(day > 28) {
				
				if(year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
					this.day = day;
					System.out.println("윤년입니다.");
				}else {System.out.println("날짜 오류입니다.");}
				
				
				System.out.println("날짜 오류입니다.");   // 이것땜에 중복으로 뜬다ㅠ
				
			}
			this.day = day;
		}
		
	}
	
	
	
	public int getYear() {
		return year;
	}
	
	
	public int getMonth() {
		return month;
	}
	
	
	public int getDay() {
		return day;
	}
	
	
	
	
	
}
