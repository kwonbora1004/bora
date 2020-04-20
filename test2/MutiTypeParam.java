package com.test2;

class DBox<L, R>{
	private L left;
	private R rigth;

	public void set(L o , R r) {
		left=o;
		rigth=r;
	}
	@Override
	public String toString() {
		return left +","+rigth;
	}
}

public class MutiTypeParam {

	public static void main(String[] args) {
	DBox<String ,Integer> box = new DBox<>();
	box.set("ap", 3);
	System.out.println(box);

	}

}
