package ch11_final;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		
		int month = now.get(Calendar.MONTH) + 1;
		String strMonth = (month < 10)? ("0" + month) : ("" + month);  // 다른것도 다 이렇게 수정해야!
		
		int day = now.get(Calendar.DAY_OF_MONTH);	
		String strDay = (day < 10)? ("0" + day) : ("" + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		
		String weekStr = null;
		switch(week) {
		case Calendar.MONDAY:
			weekStr = "월";
			break;
		case Calendar.TUESDAY:
			weekStr = "화";
			break;
		case Calendar.WEDNESDAY:
			weekStr = "수";
			break;
		case Calendar.THURSDAY:
			weekStr = "목";
			break;
		case Calendar.FRIDAY:
			weekStr = "금";
			break;
		case Calendar.SATURDAY:
			weekStr = "토";
			break;
		case Calendar.SUNDAY:
			weekStr = "일";
			break;		
		}
		
		// 배열로 하는 방법도 해보자
		
		
		
		
		// 오전오후
		int AmPm = now.get(Calendar.AM_PM);
		String AmPmStr = null;
		if(AmPm == Calendar.AM) {
			AmPmStr = "오전";
		}else {
			AmPmStr = "오후";
		}
		
		
		
		
		
		// 시분초
		int hour = now.get(Calendar.HOUR_OF_DAY);     // HOUR_OF_DAY로 해야 24시간 버전으로 나온다!
		int minute = now.get(Calendar.MINUTE);
		//int second = now.get(Calendar.SECOND);
		
		
		
		String nowTime = year + "년 " + month + "월 " + day + "일 " 
				+ weekStr + "요일 " + hour + "시 " + minute + "분";
		
		System.out.println(nowTime);
		
		
		
		
		
		
		
		
		// SimpleDateFormat로!!
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");    // 여기는 HH로 해야 24시간 버전이다!!
		
		String strDate = sdf.format(date);
		System.out.println(strDate);
		
		
		
	}
}
