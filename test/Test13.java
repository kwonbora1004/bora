package com.test;

import java.util.ArrayList;

public class Test13 {

	static Double add(ArrayList<? extends Number> num){
		double sum =0.0;
		for(Number n : num) {
			sum +=n.doubleValue();
		}return sum;
	} 
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(100);
		a1.add(200);
		System.out.println(add(a1).intValue());
		ArrayList<Double> a2 = new ArrayList<>();
		a2.add(10.1);
		a2.add(20.1);
		System.out.println(add(a2).doubleValue());
	}

}
