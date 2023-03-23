package com.learning.java8.learn.starter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class EX_0016_FlatMap {
	public static void main(String[] args) {
		try {
			Stream<String> lines = Files.lines(Paths.get("testFile.txt"));
			lines.forEach(System.out::println);
			lines = Files.lines(Paths.get("testFile.txt"));
			lines.map((l)->l.split("")).flatMap(Arrays::stream).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
