package com.test;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {System.out.println("drawing rectangle");}
}


class Circle extends Shape{
	void draw() {System.out.println("drawing Circle");}
}
	
	
public class Test12 {
	static void drawShapes(List<? extends Shape>lists) { //static<T extedns Shape>void drawShapes2(List<T> lists){
		for(Shape s  : lists) {
			s.draw();
		}
	}
	public static void main(String[] args) {
		List<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2 = new ArrayList<Circle>();
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);
	}
	
}
