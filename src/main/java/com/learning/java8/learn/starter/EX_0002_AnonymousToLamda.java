package com.learning.java8.learn.starter;

public class EX_0002_AnonymousToLamda {

	public static void main(String[] args) {

		/*
		 * new Teacher() {
		 * 
		 * public void getStudent() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */

		Teacher t = () -> {
			System.out.println("Teacher");
		};
		t.getStudent();

	}

}

@FunctionalInterface
interface Teacher {
	public void getStudent();
}