package com.tcs;

import java.util.Date;
@SuppressWarnings("deprecation")

public class MyAnnotation {
	
	public static void main(String[] args) {
		
		@CustomAnnotation
		Date today = new Date( 121, 10, 11);
		System.out.println( today);
	}
}
