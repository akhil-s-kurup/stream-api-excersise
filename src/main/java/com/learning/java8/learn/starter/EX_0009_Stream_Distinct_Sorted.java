package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0009_Stream_Distinct_Sorted {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 9,3,13,4, 5, 5, 6);
		numbers.stream().distinct().forEach(System.out::println);

		numbers.stream().sorted().forEach(System.out::print);
	
	}

}
