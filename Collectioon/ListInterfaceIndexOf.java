package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListInterfaceIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection col=Arrays.asList(10,20,30,40);
		List<Integer> list=new ArrayList<Integer>(col);
		
		System.out.println(list);
		
		int a =list.indexOf(30);
		System.out.println(a);
	}

}
