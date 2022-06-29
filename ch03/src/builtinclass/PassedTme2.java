package builtinclass;

import java.util.Calendar;

public class PassedTme2 {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		
		// startDay의 날짜
		startDay.set(2022, 5, 9); 
		System.out.print("시작일: "); 
		Printdate(startDay);
		
		
		// 오늘 날짜
		today.set(2022, 6, 29);
		System.out.print("현재일: "); 
		Printdate(today);
		
		// 오늘 날짜 - 시작일
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//밀리초(ms) 일(day)로 환산
		passedTime = passedTime / (24 * 60 * 60 * 1000);
		System.out.println("만난 지 " + passedTime + "일이 지났습니다.");
 	} // main 닫기

	private static void Printdate(Calendar date) {
		System.out.println(date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH)
		+ "월 " + date.get(Calendar.DATE) + "일");
	}
	
	// 위에는 마우스 갖다댔을 때 나오는거 클릭해서 했는데 public static void Printdate  이런식으로 해도 된다
	

}
