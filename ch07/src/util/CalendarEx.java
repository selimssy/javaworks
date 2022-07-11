package util;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		// int day = now.get(Calendar.DATE);
		int day = now.get(Calendar.DAY_OF_MONTH);    // 이것도 일 반환!!
		
		int week = now.get(Calendar.DAY_OF_WEEK);  // 일요일 :1, 월요일 2... 로 반환
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:    // 이렇게 상수로 넣어주면 좋다!
			strWeek = "월";
			break;
		case Calendar.TUESDAY:    
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:    
			strWeek = "수";
			break;
		case Calendar.THURSDAY:    
			strWeek = "목";
			break;
		case Calendar.FRIDAY:    
			strWeek = "금";
			break;
		case Calendar.SATURDAY:    
			strWeek = "토";
			break;
		case Calendar.SUNDAY:    
			strWeek = "일";
			break;
		}
		
		
		
		// 오전 오후
		int AmPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(AmPm == Calendar.AM) {
			strAmPm = "오전";				
		}else {
			strAmPm = "오후";			
		}
		
		
		
		
		
		// 시분초
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		
		// 오후 12시일 때 0시 말고 12시가 되도록
		//if(AmPm == Calendar.PM && Calendar.HOUR == 0) {
			//hour = 12;
		//}
		
		
		
		
		System.out.print(year + "년 ");   
		System.out.print(month + "월 ");   
		System.out.print(day + "일 ");         
		System.out.print(strWeek + "요일 ");   
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초");  // 2022년 7월 11일 월요일 오후 0시 18분 44초
		
		
	}

}
