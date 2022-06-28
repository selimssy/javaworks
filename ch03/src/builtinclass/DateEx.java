package builtinclass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// Date 클래스 사용
		Date today = new Date();  // util 클래스를 클릭해야!!(sql 클릭하면 안된다)
		System.out.println(today);  // Tue Jun 28 10:06:39 KST 2022   >   너무 복잡하다...SimpleDateFormat 클래스 사용해서 간단하게!
		
		
		//SimpleDateFormat 클래스 : 날짜/시간 형식
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");    // M 대문자 주의
		System.out.println(date.format(today));   // 2022/06/28

		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));   // 10:10:17 오전
		
		
		System.out.println("======================================");
		
		
		
		// LocalDate
		LocalDate localD = LocalDate.now();
		System.out.println(localD);   // 2022-06-28     // 대한민국 표준날짜   
		
		LocalTime localT = LocalTime.now();
		System.out.println(localT);    // 10:19:30.299898400     // 대한민국 표준시간   
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);              //  2022-06-28T10:41:43.089098   //대한민국 표준 날짜 / 시간   
		
		
		
		// 날짜/시간 형식 지정
		DateTimeFormatter obj = DateTimeFormatter.ofPattern("yyyy-dd-MM HH:mm:ss");   // M, H 대문자 주의
		String MyDate = now.format(obj);
		System.out.println(MyDate);  // 2022-28-06 10:37:49
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
