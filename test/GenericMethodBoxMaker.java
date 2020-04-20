package com.test;
class BOx<T>{
	private T ob;
	public void set(T ob) {
		this.ob=ob;
	}
	public T get() {
		return ob;
	}
}
class BOxFactory{
	public static <T> BOx<T> makeBox(T o){
		BOx<T> box = new BOx<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		BOx<String> sBox = BOxFactory.makeBox("sweet");
		System.out.println(sBox.get());
		
		BOx<Double> dBox = BOxFactory.makeBox(7.5);
		System.out.println(dBox.get());
	}

}
