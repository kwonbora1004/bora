package com.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("하나");
		al.add("둘");
		al.add("셋");
		
		for(String s : al) {
			System.out.println(s);
		}
		for(Iterator<String> itr =al.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("일");
		al2.add("이");
	}

}
