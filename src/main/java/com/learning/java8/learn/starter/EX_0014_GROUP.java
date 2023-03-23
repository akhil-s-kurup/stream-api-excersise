package com.learning.java8.learn.starter;

import java.util.List;
import java.util.stream.Collectors;

import com.learning.java8.stream.utill.Course;
import com.learning.java8.stream.utill.CourseList;

public class EX_0014_GROUP {
	
	public static void main(String[] args) {
		
		List courses = new CourseList().getCources();
		
		Object collect = courses.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getCategory, Collectors.toList())));
		System.out.println(collect);
		
	}

}
