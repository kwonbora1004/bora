package com.test;

class Animal<T>{
	T b;
	void setBreath(T b) {this.b=b;}
	T getBreath() {
		return b;
	}
}

class Dog{
	@Override
	public String toString() {
		return "Dog";
	}
}

class Cat{
	
}
public class Test2 {

	public static void main(String[] args) {
		Animal<Dog> a = new Animal<Dog>();
		Animal<Cat> c = new Animal<Cat>();
		a.setBreath(new Dog());
		Dog d=a.getBreath();
		System.out.println(d);
	}

}
