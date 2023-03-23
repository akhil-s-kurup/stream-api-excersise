package com.learning.java8.learn.starter;

import java.util.stream.LongStream;

public class EX_0017_ParalelStream {

	public static void main(String[] args) {
		
		
		long sum =0;
		long currentTimeMillis = System.currentTimeMillis();
		 sum = LongStream.range(0, 10000L).sum();
		System.out.println("sum is "+sum +" And time is" +(System.currentTimeMillis()-currentTimeMillis));
		
		long currentTimeMillis1 = System.currentTimeMillis();
		sum=LongStream.range(0, 10000L).parallel().sum();
		System.out.println("sum is "+sum +" And time for parrallel processing is" +(System.currentTimeMillis()-currentTimeMillis1));

		/*
		 * Output
		 * Sum is 49995000 And time is37 
		 * Sum is 49995000 And time for parrallel Processing is3
		 */
		
	}
}
