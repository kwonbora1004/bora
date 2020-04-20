package com.test;



public class Test7 {
	static <E> void printer(E[] arr) {
		for(E e:arr) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4};
		Character[]chs = {'A','a','B'};
		printer(arr);
		printer(chs);
		
	}

}
