package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
	
	
	
	public   static void streamUtil(List<String> list) {
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("moore","canary","lamabadr","dures");
		
		streamUtil(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		People p1=new People("Amit",22);
		
		People p2=new People("Sumit",30);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		List<People> peoplelist=new ArrayList<>();
		
		peoplelist.add(p1);
		peoplelist.add(p2);
		
		
		List<String> namelist=peoplelist.stream().map(people->people.getName()).collect(Collectors.toList());
		
		
		namelist.stream().forEach(x->System.out.println(x));
		
		
		//method reference here............
		
		List<String> namelist2=	peoplelist.stream().map(People::getName).collect(Collectors.toList());
		
		namelist2.stream().forEach(x->System.out.println(x));
		
		
		List<People> people1=namelist2.stream().map(name->new People(name)).collect(Collectors.toList());
		
		people1.stream().forEach(people->System.out.println(people.getName()));
		
		
		
	}
	
}

class People{
	
	
	People(String name)
	{
		this.name=name;
	}
	People(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}



interface Employee{
	
	String getFirstName();
	String getLastName();
	
	 default String showFullName() {
		String name=getFirstName()+" "+ getLastName();
		 
		 return name;
	}
	
}