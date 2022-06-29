package builtinclass;

import java.util.Calendar;

public class CalendalEx {

	public static void main(String[] args) {
		
		
		 Calendar cal =  Calendar.getInstance();
		 
		 
		 // 날짜 - 년, 월, 일
		 int year = cal.get(Calendar.YEAR);
		 int month = cal.get(Calendar.MONTH) + 1;   // 왜 1 더해야되지 
		 int date = cal.get(Calendar.DATE); 
		 
		 
		 System.out.println(year);   // 2022
		 System.out.println(month);   // 6..
		 System.out.println(date);   // 28
		 
		 
		 // 시간 = 시, 분, 초
		 int hour = cal.get(Calendar.HOUR);
		 int minute = cal.get(Calendar.MINUTE);
		 int second = cal.get(Calendar.SECOND);
		 
		 
		 // 요일 - 
		 int day = cal.get(Calendar.DAY_OF_WEEK);   // 1:일, 2:월, 3:화...
		 
		 
		 //현재 시간 측정 - 1970.1.1 자정 이후 ms 기준
		 long time  = cal.getTimeInMillis();
		 
		  
		 System.out.println(year + "년 " + month + "월 " + date + "일");    // 2022년 6월 28일
		 System.out.println(hour + "시 " + minute + "분 " + second + "초");  // 10시 53분 26초
		 System.out.println(day);   // 3
		 System.out.println(time + "ms");  // 1656463428464ms
		 System.out.println(time/1000 + "초");  // 1656463439초
	} 

}
