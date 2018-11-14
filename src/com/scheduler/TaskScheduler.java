package com.scheduler;

public class TaskScheduler extends Thread {

	final long timeinterval=1000;
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("Hello ...");
			
			try {
				Thread.sleep(timeinterval);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	
		
		
	}
	
	public static void main(String[] args) {
		
		TaskScheduler t1=new TaskScheduler();
		
		t1.start();
		
		
	}
	
}
