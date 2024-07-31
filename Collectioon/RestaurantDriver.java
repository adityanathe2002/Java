package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


class CustomerBills
{
	static int billNumber=1;
	String custName;
	long ContactNumber;
	ArrayList<String> food;
	double bill;
	public CustomerBills(String custName, long contactNumber, ArrayList<String> food, double bill) 
	{
		super();
		this.custName = custName;
		ContactNumber = contactNumber;
		ArrayList<String> food1;
		this.bill = bill;
		billNumber++;
	}
	@Override
	public String toString() 
	{
		return "[ Bill Number: "+billNumber +" custName=" + custName + ", ContactNumber=" + ContactNumber + ", food="
				+ food + ", bill=" + bill + "]";
	}
	
}

 class Restaurants
 {
	 Scanner scanner=new Scanner(System.in);
	 List<CustomerBills> list=new ArrayList<CustomerBills>();
	 
	 //Creation of bill
	 void addBill()
	 {
		System.out.println();
		System.out.println("Add New bill");
		System.out.print("Enter a Customer Name : ");
		String custName=scanner.nextLine();
		System.out.print("Contact Number : ");
		long contactNumber=scanner.nextLong();
		System.out.print("Enter the quantity of Food Consumed : ");
		ArrayList<String> food=new ArrayList<>();
		int qnty =scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <=qnty; i++) 
		{
			System.out.print("Enter the "+i +" item and price: ");
			
			String item=scanner.nextLine();
			food.add(item);
			
		}
//	biil generate LOGIC
		double bill=0;
		double [] bills=new double[food.size()];
		int indx=0;
		for (String string : food) 
		{
			String [] arr =string.split(" ");
			bills[indx++]=Double.parseDouble(arr[1]);
			
		}
		for (double d : bills) 
		{
			bill+=d;
		}
		CustomerBills bill2=new CustomerBills(custName, contactNumber, food, bill);
		list.add(bill2);
	 }
	 //display all the bill
	 void displayBill()
	 {
		ListIterator<CustomerBills> iterator=list.listIterator();
		System.out.println();
		System.out.println("**** Customer Details List ****");
		while (iterator.hasNext()) 
		{
			CustomerBills bill=iterator.next();
			System.out.println();
			System.out.println(bill);
		}
	 }
	 //updation of a bill from list
	 void updateBill()
	 {
	  ListIterator<CustomerBills> iterator = list.listIterator();
	  System.out.println();
	  System.out.println("**** Customer Details List ****");
	  while (iterator.hasNext()) 
	  {
	      CustomerBills bill = iterator.next();
	      System.out.println();
	      System.out.println(bill);
	  }
	  
	  System.out.print("Enter Bill Number to Update: ");
	  int billNumber = scanner.nextInt();
	  scanner.nextLine(); // Consume newline
	  
	  for (CustomerBills bill : list) 
	  {
	      if (billNumber == bill.billNumber) 
	      {
	          System.out.print("Enter new Customer Name (or press Enter to skip): ");
	          String newName = scanner.nextLine();
	          if (!newName.isEmpty()) {
	              bill.custName = newName;
	          }
	          
	          System.out.print("Enter new Contact Number (or 0 to skip): ");
	          long newContact = scanner.nextLong();
	          if (newContact != 0) {
	              bill.ContactNumber = newContact;
	          }
	          
	          System.out.print("Do you want to update food items? (y/n): ");
	          String updateFood = scanner.next();
	          if (updateFood.equalsIgnoreCase("y")) {
	              bill.food.clear();
	              System.out.print("Enter the quantity of Food Consumed: ");
	              int qnty = scanner.nextInt();
	              scanner.nextLine(); // Consume newline
	              for (int i = 1; i <= qnty; i++) 
	              {
	                  System.out.print("Enter the " + i + " item and price: ");
	                  String item = scanner.nextLine();
	                  bill.food.add(item);
	              }
	              
	              // Recalculate bill
	              double[] bills = new double[bill.food.size()];
	              int indx = 0;
	              for (String string : bill.food) 
	              {
	                  String[] arr = string.split(" ");
	                  bills[indx++] = Double.parseDouble(arr[1]);
	              }
	              bill.bill = 0;
	              for (double d : bills) 
	              {
	                  bill.bill += d;
	              }
	          }
	          
	          System.out.println("Bill updated successfully.");
	          return;
	      }
	  }
	  System.out.println("Bill not found.");
	 }
	 //removal of bill from list
	 void deleteBill()
	 {
		 ListIterator<CustomerBills> iterator=list.listIterator();
			System.out.println();
			System.out.print("Enter Bill Number to Delete: ");
			int billNumber=scanner.nextInt();
			while (iterator.hasNext()) 
			{
				CustomerBills bill=iterator.next();
				if (billNumber==(bill.billNumber)) 
				{
					iterator.remove();
				}
			} 
	 }
 }
public class RestaurantDriver 
{
	public static void main(String[] args) 
	{
	 Scanner scanner = new Scanner(System.in);
	 Restaurants restaurant = new Restaurants();
	 
	 while (true)
	 {
	     System.out.println("***** Welcome *****");
	     System.out.println("1. Add Bill");
	     System.out.println("2. Update Bill");
	     System.out.println("3. Display All Bills");
	     System.out.println("4. Delete Bill");
	     System.out.println("5. Exit");
	     
	     System.out.println();
	     System.out.print("Enter an Option : ");
	     int option = scanner.nextInt();
	     
	     switch (option)
	     {
	         case 1:
	         {
	             restaurant.addBill();
	             break;
	         }
	         case 2:
	         {
	             restaurant.updateBill();
	             break;
	         }
	         case 3:
	         {
	             restaurant.displayBill();
	             break;
	         }
	         case 4:
	         {
	             restaurant.deleteBill();
	             break;
	         }
	         case 5:
	         {
	             System.out.println("Thank you for using the Restaurant Bill Management System. Goodbye!");
	             System.exit(0);
	         }
	         default:
	             System.out.println("Invalid option. Please try again.");
	     }
	 }
	}
}