package information_hiding;

public class MyDate {
	
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
			if(day < 1 || day > 28) {
				if(day == 29) {
					if(year % 4 ==0 && year % 100 !=0 || year % 400 == 0) {
						this.day = day;
						System.out.println("윤년입니다.");
					}
				}
				System.out.println("날짜 오류입니다.");			
			}
			else {
				this.day = day;
				}
		}
		this.day = day;
//		else {this.day = day;}    // 이거 안해도 되는 것 같다 (2월에 저 조건 말고는 다 else로 들어가니까!)
		
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
