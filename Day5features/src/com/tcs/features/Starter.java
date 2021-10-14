package com.tcs.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Starter {
	
	public static void main(String[] args) {
		MyInterface ref1 = new MyInterface() {
			
			@Override
			public void add() {
				// TODO Auto-generated method stub
				System.out.println("add method implementation");
			}
		};
		
		MyInterface ref2 = ()->System.out.println("This is Lambda Implementation of add method");
		
		ref1.add();
		ref2.add();
		
		
		
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);   // Auto- Boxing 
		
		int a = 25;
		Integer intObj = new Integer(a);   // manual boxing
		System.out.println("Auto UnBoxing :"+intObj);  //auto - unboxing
		System.out.println("manual unboxing :"+intObj.intValue()); //manual unboxing
		
		numbersList.add(intObj);
		numbersList.add(a);
		numbersList.add(75);
		numbersList.add(27);
		numbersList.add(51);
		numbersList.add(15);
		
		System.out.println("printing as it is");
		System.out.println(numbersList);
		
//		numbersList.forEach((n)->{System.out.println(n);});
		System.out.println("using for each");
		numbersList.forEach(n->System.out.println(n));
		
		Consumer<Integer> lambda = n->System.out.println(n);
		
		Stream<Integer> intStream =  numbersList.stream();
		
		System.out.println("using lambda function as arg ");
		numbersList.forEach(lambda);
		
		System.out.println("using stream");
		intStream.forEach(lambda);
		
	}

}
