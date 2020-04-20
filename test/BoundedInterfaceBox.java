package com.test;

interface Eatable {
	public String eat();
}

class Apple11 implements Eatable {
	public String toString() {
		return "I am an apple";
	}

	@Override
	public String eat() {
		return "It tates so good!";
	}
}

class Box11<T extends Eatable>{
	T ob;
	public void set(T o) {
		this.ob=o;
	}
	public T get() {
		System.out.println(ob.eat());
		return ob;
	}
}
public class BoundedInterfaceBox {

	public static void main(String[] args) {
		Box11<Apple11> box = new Box11<>();
		box.set(new Apple11());
		
		Apple11 ap = box.get();
		System.out.println(ap);
	}

}
