package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MilliSecondToDate {

	public static void main(String[] args) {
		
		String strdate="1286649000000";
		
		
		long ldate=Long.parseLong(strdate);
		
		System.out.println(ldate);
		
		
		Calendar cal=Calendar.getInstance();
		
		cal.setTimeInMillis(ldate);
		
		Date date=cal.getTime();
		
		System.out.println(cal.getTime().toString()+"  "+ date);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		String formatstr=sdf.format(date);
		System.out.println("String format Date "+formatstr);
		
		
		
	}
	
}
