package com.test;

class Box9<T>{
	private T ob;
	public void set(T o) {ob =o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer9{
	public static void peekBox(Box9<? extends Number> box) {
		System.out.println(box);
	}
}
public class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box9<Integer> iBox = new Box9<>();
		iBox.set(1234);
		Box9<Double>dBox = new Box9<>();
		dBox.set(10.4);
		
		Unboxer9.peekBox(iBox);
		Unboxer9.peekBox(dBox);
	}

}
