package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListInterfaceAddAll {

	public static void main(String[] args) {
		
		Collection col=Arrays.asList(10,20,30,40);
		List<Integer> list=new ArrayList<Integer>(col);
		System.out.println(list);
		
		Collection col1=Arrays.asList(50,60,70);
		List<Integer>list1=new ArrayList<Integer>(col1);
		list.addAll(3, list1);
		System.out.println(list);
	}

}
