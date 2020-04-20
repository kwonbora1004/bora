package com.test;

class Apple2{}
class Box2{
	private Object a;
	public Box2(Object a) {
		this.a=a;
	}
	public void setBox(Object a) {
		this.a=a;
	}
	public Object getBox() {
		return this.a=a;
	}
}
public class Test5 {

	public static void main(String[] args) {
		Object o = new Apple2();
		Object o1;
		o1 = new Apple2();
		Box2 b = new Box2(new Apple());
		Apple a =(Apple)b.getBox();
		
		
	}

}
