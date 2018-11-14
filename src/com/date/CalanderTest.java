package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalanderTest {

	public static void main(String[] args) {
		
		/*Calendar cal = Calendar.getInstance();
		cal.setTime(entryDate);
		cal.add(Calendar.YEAR, serviceYear);
		expDate = cal.getTime();*/
		
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(new Date());
		//Substract one day form date here................
		cal.add(Calendar.DATE, -1);
		
		cal.add(Calendar.YEAR, 3);
		Date expiredate=cal.getTime();
		System.out.println(cal.getTime());
		
		
		//date format in 20-Sep-2019 here.................
		 SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy");
			
			String str=sdf.format(expiredate);
			System.out.println(str);
		
		
		
	}
	
	
	
}
