package com.collection;

import java.util.LinkedList;

public class LinkedKListMethods {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Java");
		list.add("JavaScript");
		System.out.println(list);

//		 add first element in this list
		list.addFirst("SQL");
		System.out.println(list);

//		add last element in this list
		list.addLast("Html-CSS");
		System.out.println(list);

//		remove first element in this list
		list.removeFirst();
		System.out.println(list);

//		remove Last element in this list
		list.removeLast();
		System.out.println(list);

//		get first element this list
		String get = list.getFirst();
		System.out.println(get);
		System.out.println(list.getFirst());

//		get Last element this list
		String last = list.getLast();
		System.out.println(last);
		System.out.println(list.getLast());

//		remove first occurance in this list
		System.out.println(list.removeLastOccurrence(list));

//		remove first occurance in this list
		System.out.println(list.removeFirstOccurrence(list));
	}

}
