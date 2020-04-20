package com.test2;

class Box3<T>{
	private T ob;
	public void set(T o) {ob =o;}
	public T get() {
		return ob;
	}
}

class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler{
	public static void outBox(Box3<? extends Toy>box){
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box3<? super Toy>box, Toy n) {
		box.set(n);
	}
}
public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		Box3<Toy> box = new Box3<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
		
	}

}
