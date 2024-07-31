package com.collection;

import java.util.*;
//import java.util.TreeSet;

public class TreeSetMethods {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		
		for (int i = 10; i<=100 ; i+=10) {
			integers.add(i);
		}
//		System.out.println(integers);
		TreeSet<Integer> treeset = new TreeSet<Integer>(integers);
		System.out.println(treeset.first());
//		System.out.println(treeset.last());
//		System.out.println(treeset.floor(35));
//		System.out.println(treeset.ceiling(35));
//		System.out.println(treeset.pollFirst());
//		System.out.println(treeset.pollLast());
//		System.out.println(treeset.lower(50));
//		System.out.println(treeset.higher(50));
//		System.out.println(treeset.subSet(20, 60));
//		System.out.println(treeset.headSet(10));
//		System.out.println(treeset.tailSet(20));
		
	}

}

