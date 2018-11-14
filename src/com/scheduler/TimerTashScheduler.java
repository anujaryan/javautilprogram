package com.scheduler;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTashScheduler {

	
	public static void main(String[] args) {
		
		
		System.out.println("Program started :"+new Date());
		
		Calendar calendar=Calendar.getInstance();
		
		calendar.add(Calendar.MINUTE, 1);
		
		TimerTask task=new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello  !!");
			}
			
		};
		
		
		Timer timer=new Timer();
		
		long delay=0;
		
		
		
		
		long intervalPeriod=1*1000;
		
		
		timer.schedule(task, delay,intervalPeriod);
		
		
		//timer.s
		
		
	}
	
}
