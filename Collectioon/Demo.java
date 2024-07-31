package com.collection;

import java.util.*;

public class Demo
 {
    public static void main(String[] args) 
    {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Get a ListIterator
        ListIterator<Integer> iterator = numbers.listIterator();

        System.out.println("Original list: " + numbers);

        // Demonstrate hasNext() and next()
        System.out.println("\nTraversing forward:");
        while (iterator.hasNext()) 
        {
        	iterator.next();
            System.out.println("Next element: " + iterator.next());
            System.out.println("Next Index: " + iterator.nextIndex());
            break;
        }

        // Demonstrate hasPrevious() and previous()
//        System.out.println("\nTraversing backward:");
//        while (iterator.hasPrevious()) 
//        {
//        	iterator.next();
//        	iterator.next();
//            System.out.println("Previous element: " + iterator.previous());
//            System.out.println("Previous Index: " + iterator.nextIndex());
//            break;
//        }

        // Demonstrate set()
//        System.out.println("\nReplacing elements:");
//        while (iterator.hasNext()) {
//            int num = iterator.next();
//            if (num % 2 == 0) {
//                iterator.set(num * 2);
//                System.out.println("Replaced " + num + " with " + (num * 2));
//            }
//        }

        // Demonstrate add()
//        System.out.println("\nAdding elements:");
//        iterator = numbers.listIterator(); // Reset iterator
//        while (iterator.hasNext()) {
//            int num = iterator.next();
//            if (num % 3 == 0) {
//                iterator.add(num * 10);
//                System.out.println("Added " + (num * 10) + " after " + num);
//            }
//        }

        // Demonstrate remove()
//        System.out.println("\nRemoving elements:");
//        iterator = numbers.listIterator(); // Reset iterator
//        while (iterator.hasNext()) {
//            int num = iterator.next();
//            if (num > 20) {
//                iterator.remove();
//                System.out.println("Removed " + num);
//            }
//        }
//
//        System.out.println("\nFinal list: " + numbers);
    }
}