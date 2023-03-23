package com.learning.java8.learn.starter;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class EX_0010_ALL_INBUILT_FUNCTIONAL_INETERFACE {
	
	Consumer<Integer> consumer =x->System.out.println(x); //accept() 1 argument and not return anything
	BiConsumer<String, Integer> biConsumer=(x,y)->{};//accept 2 arguments not return anything
	
	Supplier<Integer> supplier=()->2;  // supply() not argument return 1

	
	Predicate<Integer> predicate=x->x%2==0; //test() always return true accept 1 argument
	BiPredicate<Integer, String> biPredicate=(a,b)->true;//test() accept 2 diff argument and return boolean
	
	Function<String, Integer> function=(a)->Integer.parseInt(a); // apply() function accept 1 argument and return 1 , here accept string retunr integer
	BiFunction<String, Integer, String> biFunction=(a,b)->"success"; //apply() accept 2 diff argument return 1 
	
	BinaryOperator<Integer> binaryOperator=(x,y)->x+y; //apply()  accept 2 argument and return 1 all should be same type
	UnaryOperator<Integer> unaryOperator=(x)->x*3;//apply() accept 1 argument and return the same

	
	
	public static void main(String[] args) {
		
		BiConsumer<String, Integer> biConsumer=new BiConsumer<String, Integer>() {
			
			@Override
			public void accept(String t, Integer u) {
				// TODO Auto-generated method stub
				
			}
		};
		
		BiFunction<String, Integer, String> biFunction=new BiFunction<String, Integer, String>() {
			
			@Override
			public String apply(String t, Integer u) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		BiPredicate<Integer, String> biPredicate=new BiPredicate<Integer, String>() {
			
			@Override
			public boolean test(Integer t, String u) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		UnaryOperator<Integer> unaryOperator=new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Predicate<Integer> predicate=new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Consumer<Integer> consumer=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		Function<Integer, Integer> function=new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
	BinaryOperator<String> binaryOperatorS=new BinaryOperator<String>() {
		
		@Override
		public String apply(String t, String u) {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	Function<String, Integer> f=new Function<String, Integer>() {
		
		@Override
		public Integer apply(String t) {
			// TODO Auto-generated method stub
			return null;
		}
	};

}
}
