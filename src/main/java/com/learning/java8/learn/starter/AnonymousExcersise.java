package com.learning.java8.learn.starter;

public class AnonymousExcersise {
	
	public static void main(String[] args) {
		new Student() {
			
			public void getStudentName() {
				
				System.out.println("Student Name is akhil");
				
			}
		}.getStudentName();
	}
	

}

/*
 * NO class defined which impliments Student but created an anoymous inner class and called getStudents
 */
interface Student
{
	public void getStudentName();
}