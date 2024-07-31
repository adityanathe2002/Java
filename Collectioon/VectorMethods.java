package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
//		Example of No Argument Construtor of vector
//		Vector sub= new Vector();   
//		
//		System.out.println(sub.capacity());
//		
//		sub.addElement("Java");
//		sub.addElement("JavaScript");
//		sub.addElement("SQL");
//		
//		
//		for (Object object : sub) 
//		{
//			System.out.println(object);
//		}
//		for(int i=2; i<16; i+=2)
//		{
//			sub.add(i);
//		}
//		System.out.println(sub);
//		System.out.println("Cap 3: "+sub.capacity());
		
//		 Example of Argumented Construtor of vector
		Vector alpha = new Vector(5);
		
		System.out.println(alpha.capacity());
		for(char ch='A'; ch<='a';ch++)
		{
			alpha.add(ch);
		}
		System.out.println(alpha.capacity());
	}

}
