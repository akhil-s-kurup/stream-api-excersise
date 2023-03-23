package com.learning.java8.stream.utill;

import java.util.ArrayList;
import java.util.List;

public class CourseList {

	public static List<Course> getCources()
	{
		List courseList=new ArrayList();
		courseList.add(new Course("Malayalam",99,"EC"));
		courseList.add(new Course("English",95,"EC"));
		courseList.add(new Course("Hindi",94,"EC"));
		courseList.add(new Course("Tamil",93,"CS"));
		courseList.add(new Course("Thelungu",92,"CS"));
		return courseList;
	}
	
	
}
