package com.test;

class Box5<T>{
	private T ob;
	public void set(T o) {
		ob=o;
	}
	public T get() {
		return ob;
	}
}

class Box5Factory{
	public static <T extends Number> Box5<T> makeBox(T o){
		Box5<T> box =new Box5<T>();
		box.set(o);//makeBox받은타입
		System.out.println(o.intValue());
		return box;
	}
}
class Unboxer1{
	public static <T extends Number> T openBox(Box5<T> box){
		System.out.println(box.get().intValue());
		return box.get();
	}
}


public class Test8 {

	public static void main(String[] args) {
//		Box5<Integer> b = new Box5<Integer>();
//		b.set(new Integer(10));
		Box5<Integer> sBox = Box5Factory.makeBox(new Integer(1144));
		int a =Unboxer1.openBox(sBox);
		System.out.println(a);
	}
	

}
