package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceAds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection col=Arrays.asList(10,20,30,40);
		List<Integer> list=new ArrayList<Integer>(col);
		System.out.println(list);
		
		list.add(1,50);
		System.out.println(list);
	}
}
