package com.learning.java8.learn.starter;

import java.util.List;

import com.learning.java8.stream.utill.Course;
import com.learning.java8.stream.utill.CourseList;

public class EX_0011_NONMatch_AnyMatch_AllMatch {
	
	
	public static void main(String[] args) {
		
		List<Course> cources = new CourseList().getCources();
		
		
		boolean greter98 = cources.stream().anyMatch(cou->cou.getVote()>98);
		boolean greter100 = cources.stream().anyMatch(cou->cou.getVote()>100);
		System.out.println("AnyMatch : graterThan 98 " +greter98  + " greaterThan100 "+greter100   );
		
		
		boolean greter90=cources.stream().allMatch(cou->cou.getVote()>90);
		boolean greter95=cources.stream().allMatch(cou->cou.getVote()>95);
		System.out.println("AllMatch : graterThan 90 " +greter90  + " greaterThan95 "+greter95   );
		
		boolean greter104=cources.stream().noneMatch(cou->cou.getVote()>104);
		boolean greter97=cources.stream().noneMatch(cou->cou.getVote()>97);
		System.out.println("NoneMatch : graterThan 104 " +greter104  + " greaterThan97 "+greter97   );
		
	}

}
