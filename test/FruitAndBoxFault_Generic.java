package com.test;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Orange{
	public String toString() {
		return "I am an orange";
	}
}

class Box1<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}
public class FruitAndBoxFault_Generic {

	public static void main(String[] args) {
		Box1<Apple> aBox = new Box1<Apple>();
		Box1<Orange> oBox = new Box1<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}

}
