package com.learning.java8.learn.starter;

import java.util.Arrays;
import java.util.List;

public class EX_0005_ItrateAndPrintListStreamWithMethodReffernce {
	
	public EX_0005_ItrateAndPrintListStreamWithMethodReffernce(int i)
	{
	System.out.println("constructor"+i);
	}
	
	public EX_0005_ItrateAndPrintListStreamWithMethodReffernce()
	{
		
	}

	public void print(Integer i)
	{
		System.out.print(i);
	}
	
	static void printMemeber(Integer i)
	{
		System.out.print("using memmeber function"+i);
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 5, 6);
		
		//static function refferenece
		numbers.stream().forEach(EX_0005_ItrateAndPrintListStreamWithMethodReffernce::printMemeber);
		
		//constrcotr reffernce
		numbers.stream().forEach(EX_0005_ItrateAndPrintListStreamWithMethodReffernce::new);
		
		//non static fucntion reffernce
		
		EX_0005_ItrateAndPrintListStreamWithMethodReffernce r=new EX_0005_ItrateAndPrintListStreamWithMethodReffernce();
		numbers.stream().forEach(r::print);
	}

}
