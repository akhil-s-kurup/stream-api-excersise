package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0003_FilterStream {
	
	
	public static void main(String[] args) {
		
		//even number
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		numbers.stream().filter(i->i%2==0).forEach(System.out::println);
		
		
		//filter string based on length
		List<String> courses=Arrays.asList("MAL", "ENG","MATH", "TAMIL");
		courses.stream().filter(cou->cou.length()>3).forEach(System.out::println);
	}

}
