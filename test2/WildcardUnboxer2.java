package com.test2;
class Box2<T>{
	private T ob;
	public void set(T o) { ob=o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
	class Unboxer2{
		public static <T> T openBox(Box2<T> box) {
			return box.get();
		}
		public static void peekBox(Box2<?> box) {
			System.out.println(box);
		}
	}

public class WildcardUnboxer2 {

	public static void main(String[] args) {
		Box2<String> box = new Box2<>();
		box.set("So simple String");
		Unboxer2.peekBox(box);
	}

}
