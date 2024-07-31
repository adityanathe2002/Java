package com.collection;

import java.util.*;


public class ListInterfaceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection col=Arrays.asList(10,20,30,40);
		List<Integer> list=new ArrayList<Integer>(col);
		
		System.out.println(list);
		
		list.set(0,50);
		System.out.println(list);

	}

}
