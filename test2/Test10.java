package com.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("�ϳ�");
		al.add("��");
		al.add("��");
		
		for(String s : al) {
			System.out.println(s);
		}
		for(Iterator<String> itr =al.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("��");
		al2.add("��");
	}

}
