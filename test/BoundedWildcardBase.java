package com.test;

class Boxx<T>{
	private T ob;
	public void set(T o) {ob =o;}
	public T get() {return ob;}
}
class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler{
	public static void outBox(Boxx<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Boxx<Toy> box , Toy n) {
		box.set(n);
	}
}
public class BoundedWildcardBase {

	public static void main(String[] args) {
		Boxx<Toy> box = new Boxx<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
	}

}
