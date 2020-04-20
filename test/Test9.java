package com.test;

class Store<T>{
	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T getValue() {
		return this.t;
	}
}
class Box6<T , S>{
	private T t;
	private S s;
	
	public void add(T t, S s) {
		this.t=t;
		this.s=s;
	}
	public T getFirst() {
		return this.t;
	}
	public S getTow() {
		return this.s;
	}
}
public class Test9 {

	public static void main(String[] args) {
		Box6<String, Integer> b = new Box6<String,Integer>();
		b.add("홍길동", 1234);
		Box6<String,Store<String>> b2 = new Box6<String,Store<String>>();
		Store<String> s =new Store<String>();
		s.add("테스트");
		b2.add("강감찬",s);
		
		
		
		
		
		
	}

}
