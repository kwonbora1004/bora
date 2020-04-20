package com.test;

import java.util.ArrayList;

class Box7<T>{
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return this.t;
	}

}
class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al=new ArrayList<T>();
	}
	public void setAl(T v) {
		al.add(v);
	}
	public T getAl(int inx) {
		return al.get(inx);
	}
}
public class Test4 {

	public static void main(String[] args) {
		Box7<Integer> b1 = new Box7<Integer>();
		b1.add(new Integer(2));
		Box7<String> s1 = new Box7<String>();
		s1.add("hello java");
		System.out.println(b1.get());
		System.out.println(s1.get());
		
		
	}

}
