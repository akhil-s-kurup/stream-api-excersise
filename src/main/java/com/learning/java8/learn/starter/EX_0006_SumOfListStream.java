package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0006_SumOfListStream {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		Integer sum = numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println("Sum is " +sum);
		Integer sumUSingMethodReffernce = numbers.stream().reduce(0,EX_0006_SumOfListStream::add);
		System.out.println("Sum is sumUsingMethodReffernce " +sumUSingMethodReffernce);
		
		//using int stream
		int sumUsingIntStream = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum using intStream "+sumUsingIntStream);
		
		//using int stream method reffernce
       int sumUsingIntStreamM = numbers.stream().mapToInt(EX_0006_SumOfListStream::convert).sum();
				System.out.println("Sum using intStream method reffernce "+sumUsingIntStreamM);
	}

	public static int convert(Integer i) {
		return i;
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	
}
