package com.collection;

import java.util.*;

public class ListInterfaceRemove {

	public static void main(String[] args) {
		
		Collection col=Arrays.asList(10,20,30,40);
		List<Integer> list=new ArrayList<Integer>(col);

		System.out.println(list);
		
		list.remove(1);
		System.out.println("List: "+list);
		
	}

}
