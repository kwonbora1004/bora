package com.test;

class Box12<T>{
	private T ob;
	public void set(T o) {
		this.ob=o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactotry12{
	public static <T extends Number> Box12<T> makeBox(T o){
		Box12<T> box =new Box12<>();
		box.set(o);
		System.out.println("Boxed data : "+o.intValue());
		return box;
	}
}
class Unboxer{
	public static <T extends Number> T openBox(Box12 <T> box) {
		System.out.println("Unboxed data :"+box.get().intValue());
		return box.get();
	}
}
public class BoundedGenericMethod {
	public static void main(String[] args) {
		Box12<Integer> sBox = BoxFactotry12.makeBox(new Integer(5959));
		int n = Unboxer.openBox(sBox);
		System.out.println("Returned data :"+n);
				
	}

}
