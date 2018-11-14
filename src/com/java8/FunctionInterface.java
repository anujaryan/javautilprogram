package com.java8;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionInterface {

	public static int hello() {
	   System.out.println("hello method reference here...");
	   return 0;
	}
	
	
	public static void main(String[] args) {
		
		
		
		List<String> list=Arrays.asList("anuj","pachauri","deepak","pankaj","beeran","venom");
		
		
		//sorting element by stream api....
		 // List<String> sortlist=list.stream().sorted((x1,x2)->x1.compareTo(x2)).collect(Collectors.toList());
		  
		List<String> sortlist=list.stream().sorted(String::compareTo).collect(Collectors.toList());
		
		sortlist.stream().forEach(x->System.out.println(x));
		  
		  //method reference sorting 
		  
		  
		
		
		
		
		
		
		
		
		
		
		FunctionInterface fn=new FunctionInterface();
		
		//System.out.println(FunctionInterface::hello);
		/*int x=9;
		int y=10;
		(x,y)->Math.*/
		
		
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("Runnable test here....");
			}
		}).start();
		
		new Thread(()->System.out.println("inside Thread constructor ")).start();
		
		
		Runnable r=()->System.out.println("Hello Runnable method..");
		
		new Thread(r).start();
		
		
		/*Stream.of(3, 1, 4, 1, 5, 9)
		.forEach(x -> System.out.println(x));
		System.out.println("Short form of foreach loop....");
		Stream.of(3, 1, 4, 1, 5, 9)
		.forEach(System.out::println);*/
		
		
		Stream.generate(Math::random).limit(5).forEach(x->System.out.println(x));
		
		
		
	}
}
