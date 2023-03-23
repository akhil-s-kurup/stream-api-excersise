package com.learning.java8.learn.starter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learning.java8.stream.utill.Course;
import com.learning.java8.stream.utill.CourseList;

public class EX_0012_CompareWithComparator {
	
	public static void main(String[] args) {
		List<Course> cources = new CourseList().getCources();
		List<Course> collect = cources.stream().sorted(comparator).collect(Collectors.toList());
		
		collect.forEach(c->System.out.println(c.getVote()));
		
	}
	
	static Comparator<Course> comparator=(o1,o2)-> {if(o1.getVote()>o2.getVote())
		return -1;
	else
		return 1;};
}
