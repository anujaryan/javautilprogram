package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachJava8 {

	public static void main(String[] args) {
		
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		
		/*list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("forEach annonymous class :"+t);
			}
		});*/
		
		
		Myconsumer action=new Myconsumer();
		
		list.forEach(action);
		
	}
	
}

 class Myconsumer  implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Iterate over list : "+t);
		
	}
	 
 }