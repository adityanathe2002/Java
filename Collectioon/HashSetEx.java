package com.collection;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(60);
		hs.add(50);
		System.out.println(hs);
		
		HashSet hs1 = new HashSet();
		hs1.add(10);
		hs1.add(null);
		hs1.add("Hello");
		hs1.add(20);
		hs1.add(40);
		hs1.add("30");
		System.out.println(hs1);
	}

}
