package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0004_ItrateAndPrintListStream {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		numbers.stream().forEach(i -> System.out.println(i));

	}

}
