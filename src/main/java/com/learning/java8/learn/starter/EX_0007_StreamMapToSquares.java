package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0007_StreamMapToSquares {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		// sqaures of each numbers in stream
		numbers.stream().map(i -> i * i).forEach(System.out::println);

		// find its sum with IntStream
		numbers.stream().mapToInt(EX_0007_StreamMapToSquares::toSquare).sum();

		// with reduce

		numbers.stream().map(i -> i * i).reduce(0, (a, b) -> a + b);

	}

	public static int toSquare(Integer i) {
		return i * i;
	}

}
