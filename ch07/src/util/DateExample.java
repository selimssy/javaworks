package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		Date now = new Date();   // util로 import해야!!
		String strNow1 = now.toString();
		System.out.println(strNow1);    // Mon Jul 11 11:57:51 KST 2022
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);  // 2022년 07월 11일
		
	}

}
