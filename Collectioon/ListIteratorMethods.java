package com.collection;

//import java.util.ArrayList;
import java.util.*;

public class ListIteratorMethods {

	public static void main(String[] args) 
	{
//		Using the hasNext Method
		List<Integer> list =new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		ListIterator<Integer> num = list.listIterator();
		while(num.hasNext()) {
			
			System.out.println(num.hasNext());  // true 
			break;
		}
		
		
//		using the Next Method
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
////		num.next();
////		System.out.println(num.next());
//		while(num.hasNext())
//		{
////			num.next();
//			int num1=num.next();
//			System.out.println(num1);
//		}
//	
		
//		Using the hasPrevious method
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		while(num.hasNext())
//		{
//			num.next();
//		}
//		while(num.hasPrevious())
//		{
//			int hp=num.previous();
//			System.out.println(hp);
//		}
//		num.next();
//		System.out.println(num.hasPrevious());

//	 	Using the previous method
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		while(num.hasNext())
//		{
////			num.next();
////			num.next();
//			num.hasPrevious();
//			System.out.println(num.hasPrevious());
//			break;
//		}
//		num.next();
//		int num1 = num.previous();
//		System.out.println(num1);
		
//		Using the nextIndex method
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(50);
//		
//		ListIterator<Integer> num = list.listIterator();
//		num.next();
//		System.out.println(num.nextIndex());
		
//		Using the previousIndex method
//		ArrayList<Integer> list =new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		num.next();
//		System.out.println(num.previousIndex());
		

		
//		using the add method
//		List<Integer> list =new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		while(num.hasNext())
//		{
//			int c = num.next();
//			if(c==10)
//			{
//				num.previous();
//				num.add(40);
//				break;
//			}
//		}
//		System.out.println(list);
		
		
//		using the set method
//		List<Integer> list =new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		while(num.hasNext())
//		{
//			int c = num.next();
//			if(c==10)
//			{
//				num.previous();
//				num.set(20);
//				break;
//			}
//		}
//		
//		System.out.println(list);
		
		
//		using the Remove method
//		List<Integer> list =new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		
//		ListIterator<Integer> num = list.listIterator();
//		while(num.hasNext())
//		{
//			int c = num.next();
//			if(c==10)
//			{
//				num.previous();
//				num.remove();
//				break;
//			}
//		}
//		
//		System.out.println(list);
		
	}
}
