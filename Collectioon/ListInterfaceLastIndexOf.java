package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListInterfaceLastIndexOf {

	public static void main(String[] args) {
		
//		List Interface LastIndexOf()
		Collection col=Arrays.asList(10,20,10,30,10,40,10);
		List<Integer> list=new ArrayList<Integer>(col);

		System.out.println(list);
		
		int a=list.lastIndexOf(10);
		System.out.println("Last Index Of " + a);

	}

}
