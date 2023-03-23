package com.learning.java8.stream.utill;

public class Course {
	private String name;
	private int vote;
	private String category;

	
	public int getVote() {
		return vote;
	}
	
	public String getCategory()
	{
		return this.category;
	}

	public Course(String name,int vote,String cat)
	{
		this.name=name;
		this.vote=vote;
		this.category=cat;
	}
	
}
