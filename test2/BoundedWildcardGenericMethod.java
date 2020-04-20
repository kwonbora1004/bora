package com.test2;
class Box4<T>{
	private T ob;
	public void set(T o) {ob =o;}
	public T get() {return ob;}
}
class Toy4{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}
class Robot{
	@Override
	public String toString() {
		return "I am a Robot";
	}
}
class BoxHandler4{
	public static <T> void outBox(Box4<? extends T>box) {
		T t =box.get();
		System.out.println(t);
	}
	public static <T> void inBox(Box4<? super T>box,T n) {
		box.set(n);
	}
}
public class BoundedWildcardGenericMethod {
	public static void main(String[] args) {
		Box4<Toy> tBox = new Box4<>();
		BoxHandler4.inBox(tBox, new Toy());
		BoxHandler4.outBox(tBox);
		
		Box4<Robot> rBox = new Box4<>();
		BoxHandler4.inBox(rBox, new Robot());
		BoxHandler4.outBox(rBox);
		
		

	}

}
