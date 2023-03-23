package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0008_MAP_FILTER_REDUCE_Together {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		
		//sum of sqeare of all even
		
		Integer sum = numbers.stream().filter(i->i%2==0).map(i->i*i).reduce(0,(a,b)->a+b);
		System.out.println("sum of even numbers" +sum);
		
	}

}
