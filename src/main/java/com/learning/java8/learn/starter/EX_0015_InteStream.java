package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EX_0015_InteStream {
	
	public static void main(String[] args) {
		List<Integer> listdata=Arrays.asList(1,2,3,4,5);
		IntStream intStream = listdata.stream().mapToInt(Integer::intValue);
		
		IntStream numbers = IntStream.of(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
		
		numbers.boxed().sorted().collect(Collectors.toList()); // boxed is used to convert it to List<Integer>
		
		intStream.sum();
		intStream.average();

		IntStream.range(0, 100).limit(5); //will  print 0 to 5 , will not  consider 100 
		IntStream.rangeClosed(0, 100); // will  consider 100 
	
	}

}
