package com.test;

interface IAnimal2<T>{
	void set(T t);
	T get();
	void brath();
}

class Animal2<T> implements IAnimal2<T>{
	T animal;
	@Override
	public void brath() {System.out.println("Animal breath");
		
	}
	@Override
	public T get() {
		return this.animal;
	}
	@Override
	public void set(T t) {
		this.animal=t;
	}
}
class Dog2{}
public class Test14 {

	public static void main(String[] args) {
		Animal2 <Dog2> a = new Animal2<Dog2>();
		a.set(new Dog2());
		Dog2 a1=a.get();
	}

}
