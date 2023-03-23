package com.learning.java8.learn.starter;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learning.java8.stream.utill.Course;
import com.learning.java8.stream.utill.CourseList;

public class EX_0013_Limt_Skip_takeWhile_dropWhile {
	
	
	public static void main(String[] args) {
		List<Course> cources = new CourseList().getCources();
		
		cources.stream().forEach(System.out::print);
		System.out.println("skip 1");
		cources.stream().skip(1).forEach(System.out::print);
		
		System.out.println("limit 1");
		cources.stream().limit(1).forEach(System.out::print);
		
		Optional<Course> min = cources.stream().min(comparator);
		Optional<Course> max = cources.stream().max(comparator);
		cources.stream().findAny();
	//colectwhile is in java9
		
	}

	static Comparator<Course> comparator=(o1,o2)-> {
		if(o1.getVote()>o2.getVote())return 1; else return -1;
	};
}
