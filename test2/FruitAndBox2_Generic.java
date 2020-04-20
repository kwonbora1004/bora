package com.test2;

class Apple{
	@Override
	public String toString() {
		return "I am an apple";
	}
}
class Orange{
	@Override
	public String toString() {
		return "I am an orange";
	}
}

class Box6<T>{
	private T ob;
	public void set(T ob) {
		this.ob=ob;
	}
	public T get() {
		return ob;
	}
}
public class FruitAndBox2_Generic {

	public static void main(String[] args) {
		Box6<Apple> abox =new Box6<>();
		Box6<Orange> obox =new Box6<>();
		
		abox.set(new Apple());
		obox.set(new Orange());
		
		Apple ap = abox.get();
		Orange or = obox.get();
		
		System.out.println(ap);
		System.out.println(or);
		
	}

}
